# Base64 Decoder API
This project provides a simple API to decode Base64 encoded strings into their JSON representation. The API is built using Spring Boot and demonstrates the use of RESTful web services, dependency injection, and exception handling.
_____
### Features
* Decode Base64 encoded strings
* Return JSON representation of decoded data
* Handle invalid Base64 and JSON data with appropriate error messages
### Project Structure
The project consists of the following main components:

* Controller: Handles HTTP requests and responses.
* Service: Contains business logic for decoding Base64 data.
* DTO (Data Transfer Objects): Represents the data structure for requests and responses.

### DTO (Data Transfer Objects)
```Base64Request```
* Represents the incoming request body containing the Base64-encoded string.
* ```String text:``` Holds the Base64-encoded string.

```ErrorResponse```
* Represents the structure of error responses.
* ```String error:``` Holds the error message.
### Endpoint:
```@PostMapping("/decode"):``` Maps HTTP POST requests to the ```decodeBase64``` method.

## Running the Application
To run the application, use the following command:
```java
mvn spring-boot:run
```
The API will be available at http://localhost:8080/decode.

## Usage
Send a POST request to ``` /decode ``` with a JSON body containing the Base64 encoded string:
```json
{
    "text": "eyJrZXkiOiAiVmFsdWUifQ=="
}
```
The response will be the decoded JSON object:

```json
{
    "key": "Value"
}
```
If the input is invalid Base64 or JSON data, the response will contain an error message:

```json
{
    "error": "Invalid base64 data: ..."
}
```


