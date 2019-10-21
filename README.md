# react-native-giraffe-player2

## Getting started

`$ npm install react-native-giraffe-player2 --save`

### Mostly automatic installation

`$ react-native link react-native-giraffe-player2`

### Manual installation


#### iOS

1. In XCode, in the project navigator, right click `Libraries` ➜ `Add Files to [your project's name]`
2. Go to `node_modules` ➜ `react-native-giraffe-player2` and add `GiraffePlayer2.xcodeproj`
3. In XCode, in the project navigator, select your project. Add `libGiraffePlayer2.a` to your project's `Build Phases` ➜ `Link Binary With Libraries`
4. Run your project (`Cmd+R`)<

#### Android

1. Open up `android/app/src/main/java/[...]/MainApplication.java`
  - Add `import com.grovertb.GiraffePlayer2Package;` to the imports at the top of the file
  - Add `new GiraffePlayer2Package()` to the list returned by the `getPackages()` method
2. Append the following lines to `android/settings.gradle`:
  	```
  	include ':react-native-giraffe-player2'
  	project(':react-native-giraffe-player2').projectDir = new File(rootProject.projectDir, 	'../node_modules/react-native-giraffe-player2/android')
  	```
3. Insert the following lines inside the dependencies block in `android/app/build.gradle`:
  	```
      compile project(':react-native-giraffe-player2')
  	```


## Usage
```javascript
import GiraffePlayer2 from 'react-native-giraffe-player2';

// TODO: What to do with the module?
GiraffePlayer2;
```
