protoc ./protos/*.proto --js_out=import_style=commonjs,binary:js
protoc ./protos/*.proto --java_out=java
protoc ./protos/*.proto --python_out=python