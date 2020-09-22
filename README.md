# corda-rpc
This project is to check corda rpc client. 

## Setting Steps
1. Git clone https://github.com/corda/samples-kotlin 
2. move to Basic/cordapp-example project
3. run `./gradlew clean deployNodes` and `./workflows-kotlin/build/nodes/runnodes`, `./gradlew runPartyBServer`
4. run this projects

## Settings

### Rpc client parameters
Check Basic/cordapp-example/build.gradle file and check task `runPartyBServer` and args. 

### Dependency
Check these files
- `Basic/cordapp-example/clients/build.gradle`
- `Basic/cordapp-example/build.gradle`
- `Basic/cordapp-example/setting.properties`
