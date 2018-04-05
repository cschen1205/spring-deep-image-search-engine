# spring-deep-image-search-engine

Deep Learning based Image Search Engine implemented in Spring and Tensorflow

# Usage

### Build

Make sure you have Java 8 SDK and maven installed on your local machine. 

If you are on Windows platform, Run make.ps1 in the project root (from Powershell) to build the server jar:

```bash
./make.ps1
```

If you are on a unix machine, run the following command:

```bash
mvn -f pom.xml clean package -Plocal -U
cp target/deep-image-search-engine.jar deep-image-search-engine.jar 
```

### Run backend

Run the following command from the root directory of the project:

```bash
java -jar deep-image-search-engine.jar
```

This will start the backend server running at http://localhost:8081

To view the list of api available, the link is at http://localhost:8081/swagger-ui.html

### Run frontend

Run the following command from the root directory of the project:

```bash
cd frontend
npm install
npm start
``` 

This will start the Vue frontend running at http://localhost:8080