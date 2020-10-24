# Spring Data MongoDB Getting Started

Overview

## Description

## Demo
### Run MongoDB Container
```shell script
$ docker run --rm -d -p 27017:27017 --name mongodb mongo:4.4.1
```

#### Mongo CLI

```shell script
$ docker exec -it mongodb /bin/bash
```

##### 

### Configuration for MongoDB to connect from Spring App
```yaml
spring:
  data:
    mongodb:
      uri: localhost:27017
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
