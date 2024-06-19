#!/bin/bash


# Load environment variables from .env file
if [ -f .env ]; then
    source .env
fi
# Make a GET request to the helloWorld endpoint and store the response
RESPONSE=$(curl -s http://localhost:${TEST_WEBSERVICE_PORT:-8080}/helloworld)

# Print the response
echo "Response Body: $RESPONSE"








