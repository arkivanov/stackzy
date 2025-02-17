# 🚀 stackzy

![](extras/libs.png)

👷 This project is under active development.

[comment]: <> (![latestVersion]&#40;https://img.shields.io/github/v/release/theapache64/stackzy&#41;)
<a href="https://twitter.com/theapache64" target="_blank">
<img alt="Twitter: theapache64" src="https://img.shields.io/twitter/follow/theapache64.svg?style=social" />
</a>

> A desktop app to analyse APK. Built using Compose desktop

### ✨ Demo

- [Watch](https://www.youtube.com/watch?v=XtM-sRLxLLc&ab_channel=theapache64) demo


### 📽️ Usage

- [Show](docs/USAGE.md) usage

## 💻 Install

| Platform | Download | Status |
|----------|----------|--------|
| Linux    |[![Download Button](https://img.shields.io/static/v1?label=Linux&message=Stackzy.deb&color=30A3E6)](https://github.com/theapache64/stackzy/releases/latest)| ✅ Stable | 
| Windows    |[![Download Button](https://img.shields.io/static/v1?label=Windows&message=Stackzy.msi&color=30A3E6)](https://github.com/theapache64/stackzy/releases/latest)| 🔬 Experimental | 
| MacOS    |[![Download Button](https://img.shields.io/static/v1?label=MacOS&message=Stackzy.jar&color=30A3E6)](https://github.com/theapache64/stackzy/releases/latest)| 🔬 WIP | 

*Need help to stabilize Windows and MacOS version. PRs are highly appreciated*

## 🏋 Dependency

- Java 8 or above

## 🏗️️ Built with

| What            | How                        |
|----------------	|------------------------------	|
| 🎭 User Interface    | [Compose Desktop](https://github.com/jetbrains/compose-jb)                |
| 🏗 Architecture    | [MVVM](https://en.wikipedia.org/wiki/Model%E2%80%93view%E2%80%93viewmodel)                            |
| 🧠 Backend    | [Retrosheet](https://github.com/theapache64/retrosheet)                            |
| 💉 DI                | [Dagger2](https://github.com/google/dagger)                        |
| 🛠️ APK Decompiling                | [ApkTool](https://github.com/iBotPeaches/Apktool)                        |
| 🛣️ Navigation        | [Decompose](https://github.com/arkivanov/Decompose)                        |
| 🌊 Async            | [Coroutines](https://kotlinlang.org/docs/coroutines-overview.html) + [Flow](https://kotlin.github.io/kotlinx.coroutines/kotlinx-coroutines-core/kotlinx.coroutines.flow/-flow/)                |
| 🌐 Networking        | [Retrofit](https://github.com/square/retrofit)                        |
| 📄 JSON            | [Moshi](https://github.com/square/moshi)                            |
| ⌨️ Logging            | [Arbor](https://github.com/ToxicBakery/Arbor)                            |
| 💻 ADB            | [Adam](https://malinskiy.github.io/adam/)                            |
| 🧪 Testing            | [DaggerMock](https://github.com/fabioCollini/DaggerMock) + [JUnit](https://github.com/junit-team/junit5)    |

## 😂 Fun Facts

- Stackzy uses [a google sheet](https://docs.google.com/spreadsheets/d/1KBxVO5tXySbezBr-9rb2Y3qWo5PCMrvkD1aWQxZRepI/edit#gid=284770392) as the backend, thanks to [Retrosheet](https://github.com/theapache64/retrosheet)

- The initial name of Stackzy was `Which Stack`
- Stackzy uses a gloabl caching mechanism, which works as a centralized caching system. Means, if **someone** decompiled `WhatsApp`, the next time you try to find the stack, it won't be decompiled and the result will be served from the cache.

## 🙇 Credits

- Special thanks to [@mikepenz](https://github.com/mikepenz) for contributing 200+ libraries from his
  project [AboutLibraries](https://github.com/mikepenz/AboutLibraries) 📚
- Special thanks to [@SpikeySanju](https://github.com/Spikeysanju) for the beautiful design 😎
- Icons are from [flaticon.com](https://www.flaticon.com/)
- Illustrations are from [evernote.design](https://evernote.design/categories/illustrations/)

## 🥼 Test

Before executing any test, ensure

- A device has connected to the adb
- a valid `PLAY_API_GOOGLE_USERNAME` and `PLAY_API_GOOGLE_PASSWORD` defined in your environment.

## ✍️ Author

👤 **theapache64**

* Twitter: <a href="https://twitter.com/theapache64" target="_blank">@theapache64</a>
* Email: theapache64@gmail.com

Feel free to ping me 😉

## 🤗 Contributors

👤 **mikepenz**

* Twitter: <a href="https://twitter.com/mike_penz" target="_blank">@mike_penz</a>
* Email: mikepenz@gmail.com

## 🤝 Contributing

- See [CONTRIBUTING.md](docs/CONTRIBUTING.md)

## ❤ Show your support

Give a ⭐️ if this project helped you!

<a href="https://www.patreon.com/theapache64">
  <img alt="Patron Link" src="https://c5.patreon.com/external/logo/become_a_patron_button@2x.png" width="160"/>
</a>

<a href="https://www.buymeacoffee.com/theapache64" target="_blank">
    <img src="https://cdn.buymeacoffee.com/buttons/v2/default-yellow.png" alt="Buy Me A Coffee" width="160">
</a>

<a href="https://www.paypal.me/theapache64" target="_blank">
    <img src="https://www.paypalobjects.com/en_US/i/btn/btn_donateCC_LG.gif" alt="Donation" width="160">
</a>

## ☑️ TODO

- [x] Release the first public version with basic features
- [ ] Theme switching
- [x] Playstore integration (Download APK from playstore)
- [ ] Support more libraries

## 📝 License

- [Fira Code](https://github.com/tonsky/FiraCode) : [OFL-1.1 Licence](https://github.com/tonsky/FiraCode/blob/master/LICENSE)

```
Copyright © 2021 - theapache64

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

   http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
```

_This README was generated by [readgen](https://github.com/theapache64/readgen)_ ❤
