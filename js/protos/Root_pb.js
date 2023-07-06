// source: protos/Root.proto
/**
 * @fileoverview
 * @enhanceable
 * @suppress {messageConventions} JS Compiler reports an error if a variable or
 *     field starts with 'MSG_' and isn't a translatable message.
 * @public
 */
// GENERATED CODE -- DO NOT EDIT!

var jspb = require('google-protobuf');
var goog = jspb;
var global = Function('return this')();

var protos_Ping_pb = require('../protos/Ping_pb.js');
goog.object.extend(proto, protos_Ping_pb);
var protos_LogTail_pb = require('../protos/LogTail_pb.js');
goog.object.extend(proto, protos_LogTail_pb);
var protos_Auth_pb = require('../protos/Auth_pb.js');
goog.object.extend(proto, protos_Auth_pb);
goog.exportSymbol('proto.protos.Root', null, global);
goog.exportSymbol('proto.protos.Root.InnerMessageCase', null, global);
/**
 * Generated by JsPbCodeGenerator.
 * @param {Array=} opt_data Optional initial data array, typically from a
 * server response, or constructed directly in Javascript. The array is used
 * in place and becomes part of the constructed object. It is not cloned.
 * If no data is provided, the constructed object will be empty, but still
 * valid.
 * @extends {jspb.Message}
 * @constructor
 */
proto.protos.Root = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, proto.protos.Root.oneofGroups_);
};
goog.inherits(proto.protos.Root, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.protos.Root.displayName = 'proto.protos.Root';
}

/**
 * Oneof group definitions for this message. Each group defines the field
 * numbers belonging to that group. When of these fields' value is set, all
 * other fields in the group are cleared. During deserialization, if multiple
 * fields are encountered for a group, only the last value seen will be kept.
 * @private {!Array<!Array<number>>}
 * @const
 */
proto.protos.Root.oneofGroups_ = [[1,2,3]];

/**
 * @enum {number}
 */
proto.protos.Root.InnerMessageCase = {
  INNER_MESSAGE_NOT_SET: 0,
  PING: 1,
  LOGTAIL: 2,
  AUTH: 3
};

/**
 * @return {proto.protos.Root.InnerMessageCase}
 */
proto.protos.Root.prototype.getInnerMessageCase = function() {
  return /** @type {proto.protos.Root.InnerMessageCase} */(jspb.Message.computeOneofCase(this, proto.protos.Root.oneofGroups_[0]));
};



if (jspb.Message.GENERATE_TO_OBJECT) {
/**
 * Creates an object representation of this proto.
 * Field names that are reserved in JavaScript and will be renamed to pb_name.
 * Optional fields that are not set will be set to undefined.
 * To access a reserved field use, foo.pb_<name>, eg, foo.pb_default.
 * For the list of reserved names please see:
 *     net/proto2/compiler/js/internal/generator.cc#kKeyword.
 * @param {boolean=} opt_includeInstance Deprecated. whether to include the
 *     JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @return {!Object}
 */
proto.protos.Root.prototype.toObject = function(opt_includeInstance) {
  return proto.protos.Root.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.protos.Root} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.protos.Root.toObject = function(includeInstance, msg) {
  var f, obj = {
    ping: (f = msg.getPing()) && protos_Ping_pb.Ping.toObject(includeInstance, f),
    logtail: (f = msg.getLogtail()) && protos_LogTail_pb.LogTail.toObject(includeInstance, f),
    auth: (f = msg.getAuth()) && protos_Auth_pb.Auth.toObject(includeInstance, f)
  };

  if (includeInstance) {
    obj.$jspbMessageInstance = msg;
  }
  return obj;
};
}


/**
 * Deserializes binary data (in protobuf wire format).
 * @param {jspb.ByteSource} bytes The bytes to deserialize.
 * @return {!proto.protos.Root}
 */
proto.protos.Root.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.protos.Root;
  return proto.protos.Root.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.protos.Root} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.protos.Root}
 */
proto.protos.Root.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = new protos_Ping_pb.Ping;
      reader.readMessage(value,protos_Ping_pb.Ping.deserializeBinaryFromReader);
      msg.setPing(value);
      break;
    case 2:
      var value = new protos_LogTail_pb.LogTail;
      reader.readMessage(value,protos_LogTail_pb.LogTail.deserializeBinaryFromReader);
      msg.setLogtail(value);
      break;
    case 3:
      var value = new protos_Auth_pb.Auth;
      reader.readMessage(value,protos_Auth_pb.Auth.deserializeBinaryFromReader);
      msg.setAuth(value);
      break;
    default:
      reader.skipField();
      break;
    }
  }
  return msg;
};


/**
 * Serializes the message to binary data (in protobuf wire format).
 * @return {!Uint8Array}
 */
proto.protos.Root.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.protos.Root.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.protos.Root} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.protos.Root.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getPing();
  if (f != null) {
    writer.writeMessage(
      1,
      f,
      protos_Ping_pb.Ping.serializeBinaryToWriter
    );
  }
  f = message.getLogtail();
  if (f != null) {
    writer.writeMessage(
      2,
      f,
      protos_LogTail_pb.LogTail.serializeBinaryToWriter
    );
  }
  f = message.getAuth();
  if (f != null) {
    writer.writeMessage(
      3,
      f,
      protos_Auth_pb.Auth.serializeBinaryToWriter
    );
  }
};


/**
 * optional Ping ping = 1;
 * @return {?proto.Ping}
 */
proto.protos.Root.prototype.getPing = function() {
  return /** @type{?proto.Ping} */ (
    jspb.Message.getWrapperField(this, protos_Ping_pb.Ping, 1));
};


/**
 * @param {?proto.Ping|undefined} value
 * @return {!proto.protos.Root} returns this
*/
proto.protos.Root.prototype.setPing = function(value) {
  return jspb.Message.setOneofWrapperField(this, 1, proto.protos.Root.oneofGroups_[0], value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.protos.Root} returns this
 */
proto.protos.Root.prototype.clearPing = function() {
  return this.setPing(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.protos.Root.prototype.hasPing = function() {
  return jspb.Message.getField(this, 1) != null;
};


/**
 * optional LogTail logTail = 2;
 * @return {?proto.LogTail}
 */
proto.protos.Root.prototype.getLogtail = function() {
  return /** @type{?proto.LogTail} */ (
    jspb.Message.getWrapperField(this, protos_LogTail_pb.LogTail, 2));
};


/**
 * @param {?proto.LogTail|undefined} value
 * @return {!proto.protos.Root} returns this
*/
proto.protos.Root.prototype.setLogtail = function(value) {
  return jspb.Message.setOneofWrapperField(this, 2, proto.protos.Root.oneofGroups_[0], value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.protos.Root} returns this
 */
proto.protos.Root.prototype.clearLogtail = function() {
  return this.setLogtail(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.protos.Root.prototype.hasLogtail = function() {
  return jspb.Message.getField(this, 2) != null;
};


/**
 * optional Auth auth = 3;
 * @return {?proto.Auth}
 */
proto.protos.Root.prototype.getAuth = function() {
  return /** @type{?proto.Auth} */ (
    jspb.Message.getWrapperField(this, protos_Auth_pb.Auth, 3));
};


/**
 * @param {?proto.Auth|undefined} value
 * @return {!proto.protos.Root} returns this
*/
proto.protos.Root.prototype.setAuth = function(value) {
  return jspb.Message.setOneofWrapperField(this, 3, proto.protos.Root.oneofGroups_[0], value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.protos.Root} returns this
 */
proto.protos.Root.prototype.clearAuth = function() {
  return this.setAuth(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.protos.Root.prototype.hasAuth = function() {
  return jspb.Message.getField(this, 3) != null;
};


goog.object.extend(exports, proto.protos);
