#!/bin/sh

echo ""
echo "Building project and Docker image "
#btw you can change the image repo and version too
#best practice is to align it to the pom artifact name and version
export MY_IMAGE="CHANGE-IT/entando-bundle-seed-ms-springboot-kc:0.0.1-SNAPSHOT"

docker build -t ${MY_IMAGE}  .
echo "Built $MY_IMAGE"

echo ""
echo "Uploading $MY_IMAGE to dockerhub"
docker push $MY_IMAGE
