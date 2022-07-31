<div align="center">

<img src="https://cdn.discordapp.com/attachments/834011720434581505/1003294205252219020/download.jpg" alt="Logo" width="200px" height="200px" style="border-radius:50%"/>

# voe

**Tiny and embeddable Revolt media transport library based on Netty.**

[![GitHub](https://img.shields.io/github/license/nezuchan/kotlin-template)](https://github.com/nezuchan/kotlin-template/blob/main/LICENSE)
[![Discord](https://discordapp.com/api/guilds/785715968608567297/embed.png)](https://nezu.my.id)

</div>

#### Disclaimer:
- This is based on [koe](https://github.com/KyokoBot/koe), with modified API

[Get it on JitPack](https://jitpack.io/#org.nezu.voe/core)

Example:

```groovy
repositories {
    maven { url 'https://jitpack.io' }
}

// ...

dependencies {
    implementation 'org.nezu.voe:core:VERSION'
}
```

`VERSION` can be either a tag or a git commit hash.

#### Dependencies
- Netty
- slf4j

#### Features

- Easily extendable for stuff such as support for codecs other than Opus sending
- Basic RTCP support for measuring packet loss and other stuff.

#### Non-goals / won't do

- Encoding - Voe only implements voice server communication, not voice handling itself, so it only accepts Opus frames and you have set up an encoder yourself, use [lavaplayer](https://github.com/sedmelluq/lavaplayer), libav/ffmpeg or anything else.