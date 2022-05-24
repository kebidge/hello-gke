# hello-gke
[![Build and Deploy to GKE](https://github.com/kebidge/hello-gke/actions/workflows/pipelines.yaml/badge.svg?branch=main)](https://github.com/kebidge/hello-gke/actions/workflows/pipelines.yaml)

> **_INFO:_** Sample Repository to describe how to set up a GiHub Actions workflow and deploy a simple Spring Boot App to Google Kubernetes Engine.

## Available Endpoints

### Initial Endpoint
```sh
http://34.134.178.228/
```
> **_OUTPUT:_**  Hello World!

### Test Endpoint
```sh
http://34.134.178.228/test
```
> **_OUTPUT:_**  Hello Test!

### Kebidge Endpoint
```sh
http://34.134.178.228/kebidge
```
> **_OUTPUT:_**  Hello Kebidge!

### Fidel Endpoint
```sh
http://34.134.178.228/fidel
```
> **_OUTPUT:_**  Hello Fidel!

### Pipeline Endpoint
```sh
http://34.134.178.228/pipeline
```
> **_OUTPUT:_**  Build - Test - Deploy

### Personal Endpoint
> **_INFO:_**  Set value via endpoint parameter, e.g. `You`
```sh
http://34.134.178.228/hello/You
```
> **_OUTPUT:_**  Hello You!

