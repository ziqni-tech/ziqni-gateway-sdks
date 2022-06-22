#!/bin/bash

# Execute this script from inside the openapi folder

SPEC_FILE=../ziqni-gateway-api.yml
CONF_FILE=ziqni-gateway-api.config.yml
GEN_DIR=generated
FILE=generate-client-code.sh

if [ -z "$1" ]; then
  echo "No argument supplied"
else
  cd ../openapi/java || exit
fi

echo "++++++++++ GENERATING ++++++++++"
pwd

if [ -f "$FILE" ]; then
  echo "$FILE exists."
else
  echo "$FILE does not exist."
  exit
fi

if [[ -d "$GEN_DIR" ]]; then
  echo "$GEN_DIR exists."
  rm -rf ./generated
  echo "$GEN_DIR deleted."
  mkdir generated
  echo "$GEN_DIR created."

  openapi-generator-cli  generate -g java -i $SPEC_FILE -c $CONF_FILE -o ./generated --additional-properties=asyncNative=true --additional-properties=library=native -t ./templates

  # Copy the updated docs
  rm -rf ../../java/docs
  mkdir ../../java/docs
  cp -v ./generated/docs/* ../../java/docs/

  # Copy the new sources
      mkdir -p ../../java/src/generated
      cp -rf ./generated/src/main/java ../../java/src/generated/

else
  echo "Directory '<project-root>/openapi/java/$GEN_DIR' not found"
fi

