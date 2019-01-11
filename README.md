This is a repo to use as a quick start to start working with Spring Boot and deploying with the fabric8/s2i-java image.  
The code contains a sample REST based service listening at /hello.

```bash
oc new-app fabric8/s2i-java~hhttps://github.com/ttreuthardt/spring-boot-openshift-sample.git#java --allow-missing-images
```
