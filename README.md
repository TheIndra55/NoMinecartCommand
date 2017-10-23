# NoMinecartCommand
 This is an old plugin which i wrote for a server where i was developer, the main purpose of the plugin is to disable commands in minecart. This is because of a bug in traincarts where if you get teleport (for example by using /warp etc) you get kicked out of the train and spawn on the rails. Because we didn't want to to happen we didn't allow users to execute commands when they're in a minecart, expect the commands which were set into the config.
 
 # Screenshot
 ![imgur](https://i.imgur.com/Ywvrj1b.png)
 
 # Configuration
 ```
 #whitelisted commands which may be executed by the player
commands:
    - audio
    - connect
    - openaudio
    - admin

#the message which will be displayed when you execute and command which is not whitelisted
bericht: '&4Je kan geen commands uitvoeren tijdens de rit!' 
```
