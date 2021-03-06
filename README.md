# Spring Data MongoDB Getting Started

MongoDB is document-based distributed Database.
Spring Data MongoDB enables you to operate it from Spring Application.

## Description
### Dependency
- `spring-boot-starter-data-mongodb`

```kotlin
dependencies {
	implementation("org.springframework.boot:spring-boot-starter-data-mongodb")
}
```

### Configuration for MongoDB to connect from Spring App
You can configure connection definition in `application.yml`

- host: `localhost`
  - We use MongoDB in a container at localhost
- port: `27017` (Default port)
- database: database name

```yaml
spring:
  data:
    mongodb:
      host: localhost
      port: 27017
      database: spring
```

## Demo
### Run MongoDB Container
```shell script
$ docker run --rm -d -p 27017:27017 --name mongodb mongo:4.4.1
```

#### Mongo CLI

```shell script
$ docker exec -it mongodb /bin/bash
```

##### Show Databases list

```shell script
> show dbs

admin   0.000GB
config  0.000GB
local   0.000GB
spring  0.000GB
test    0.000GB
```

##### Use/Switch Database

```shell script
> use spring

switched to db spring
```
##### Show Collections

```shell script
> show collections

customer
```

##### Show Collections' Status

```shell script
> db.collection.stats()
```

##### Show Collections' contents

- `db.collections.find()`

```shell script
> db.product.find( {QUERY} )
```

## Features

- feature:1
- feature:2

## Requirement

## Usage

## Installation

## Licence

Released under the [MIT license](https://gist.githubusercontent.com/shinyay/56e54ee4c0e22db8211e05e70a63247e/raw/34c6fdd50d54aa8e23560c296424aeb61599aa71/LICENSE)

## Author

[shinyay](https://github.com/shinyay)
