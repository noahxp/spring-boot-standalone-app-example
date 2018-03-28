# Spring Boot Standalone Application Example
Spring Boot 直接執行程式範例

## 使用的工具
- gradle 套件相依管理
- spring boot framework
- [lombok](https://projectlombok.org/) 簡化 java 代碼，尤其是 java model 及 log4j 宣告式
  
## 執行方式
- 在開發工具裡執行
- 透過 gradle 打包後執行
```bash
java -jar XXXXXX.jar
```
- 如果需再引用外部 jar 
```bash
java -cp XXXXXX.jar:YYYYYY.jar org.springframework.boot.loader.JarLauncher
```