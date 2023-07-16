
"use client";
import React, { useState, useCallback, useEffect } from 'react';
import useWebSocket, { ReadyState } from 'react-use-websocket';
import {Root} from "./protos/Root_pb"
import {Ping} from "./protos/Ping_pb"
import {LogTail} from "./protos/LogTail_pb"
import {Auth} from "./protos/Auth_pb"


const WebSocketDemo = () => {
  //Public API that will echo messages sent to it back to the client
  const [socketUrl, setSocketUrl] = useState('ws://192.168.68.55:9988');
  const [messageHistory, setMessageHistory] = useState([]);

  const { sendMessage, lastMessage, readyState } = useWebSocket(socketUrl,{
    onMessage : (event)=>{
      var fileReader = new FileReader();
      fileReader.onload = (fevent) => {
        var root2 = Root.deserializeBinary(fevent.target.result);
        switch(root2.getInnerMessageCase()){
            case Root.InnerMessageCase.PING:
                console.log(root2.getPing().getPingnum())
            case Root.InnerMessageCase.LOGTAIL:
              console.log(root2.getLogtail().getData())
        }
      };
      fileReader.readAsArrayBuffer(event.data);
      
    },
    onOpen : (event) =>{
      console.log(event)
      var num = 0;
      console.log(Root)
      console.log(Ping)
      setInterval(() => {
        var ping = new Ping();
        num = num + 1;
        ping.setPingnum(num);
        var root = new Root();
        root.setPing(ping);

        // Serializes to a UInt8Array.
        var bytes = root.serializeBinary();
        // var message2 = Ping.Ping.deserializeBinary(bytes);
        // console.log(message2.getName())
        sendMessage(bytes);
      }, 10000);
      var root = new Root();
      var logTail = new LogTail();
      logTail.setUsername("user");
      logTail.setProjectname("prod_app_logs");
      logTail.setInstancename("ip-172-31-1-180.ec2.internal");
      logTail.setKeyword("");
      logTail.setPeriod(100);
      root.setLogtail(logTail);
      var bytes = root.serializeBinary();
      sendMessage(bytes);
      // send auth
      //var root = new Root();
      //var auth = new Auth();
      //auth.setUsername("user");
      //auth.setToken("*****--*****----***");
      //root.setAuth(auth);
      //var bytes = root.serializeBinary();
      //sendMessage(bytes);
      
    }
  });

  useEffect(() => {
    if (lastMessage !== null) {
      setMessageHistory((prev) => prev.concat(lastMessage));
    }
  }, [lastMessage, setMessageHistory]);

  const handleClickSendMessage = useCallback(() => {
    
  }, []);

  const connectionStatus = {
    [ReadyState.CONNECTING]: 'Connecting',
    [ReadyState.OPEN]: 'Open',
    [ReadyState.CLOSING]: 'Closing',
    [ReadyState.CLOSED]: 'Closed',
    [ReadyState.UNINSTANTIATED]: 'Uninstantiated',
  }[readyState];

  return (
    <div>
      {/* <button
        onClick={handleClickSendMessage}
        disabled={readyState !== ReadyState.OPEN}
      >
        Click Me to send Hello
      </button>
      <p>The WebSocket is currently {connectionStatus}</p>
      {lastMessage ? <p>Last message: {lastMessage.data}</p> : null}
      <ul>
        {messageHistory.map((message, idx) => (
          <p key={idx}>{message ? message.data : null}</p>
        ))}
      </ul> */}
    </div>
  );
};

export default WebSocketDemo;
