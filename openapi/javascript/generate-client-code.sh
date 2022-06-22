#!/bin/bash

# Execute this script from inside the openapi folder

SPEC_FILE=../ziqni-gateway-api.yml
CONF_FILE=ziqni-gateway-api.config.yml
GEN_DIR=generated
FILE=generate-client-code.sh

echo "++++++++++ GENERATING ++++++++++"
pwd

if [ -f "$FILE" ]; then
  echo "$FILE exists."
else
  echo "<project-root>/openapi/javascript/$FILE does not exist."
  exit
fi

if [[ -d "$GEN_DIR" ]]; then
  echo "$GEN_DIR exists."
  rm -rf ./generated
  echo "$GEN_DIR deleted."
  mkdir generated
  echo "$GEN_DIR created."

  openapi-generator-cli generate -g  javascript -i $SPEC_FILE -c $CONF_FILE -o ./generated

  cd ../../javascript || exit

  rm -rf ./*
  cp -rf ../openapi/javascript/generated/* ./

  npm install
  npm link
  npm run build
  npm install @ziqni-tech/gamification-api-client

else
  echo "Directory '<project-root>/openapi/javascript/$GEN_DIR' not found"
fi

