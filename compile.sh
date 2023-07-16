protoc ./protos/*.proto --js_out=import_style=commonjs,binary:js --experimental_allow_proto3_optional
protoc ./protos/*.proto --java_out=java --experimental_allow_proto3_optional