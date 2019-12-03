# react-native-giraffeplayer2

> Video Player based on [GiraffePlayer2](https://github.com/tcking/GiraffePlayer2) for react-native

*Only Android support now.*

## Getting started

`$ npm install react-native-giraffeplayer2 --save`


### Screen

![](https://raw.githubusercontent.com/grovertb/react-native-giraffeplayer2/master/screens/demo.gif)

## Usage
```javascript
import React from 'react';
import {StyleSheet, View, Text, TouchableOpacity} from 'react-native';

import GiraffePlayer2 from 'react-native-giraffeplayer2';

export default function App() {
  React.useEffect(() => {
    GiraffePlayer2.setShowTopBar(true);
    GiraffePlayer2.setFullScreenOnly(true);
  }, []);

  const _handleClickPlay = () => {
    GiraffePlayer2.setTitle('Demo');
    GiraffePlayer2.play('http://clips.vorwaerts-gmbh.de/big_buck_bunny.mp4');
  };

  return (
    <View style={styles.body}>
      <Text style={styles.title}>GiraffePlayer2</Text>
      <TouchableOpacity style={styles.button} onPress={_handleClickPlay}>
        <Text>Play</Text>
      </TouchableOpacity>
    </View>
  );
}

const styles = StyleSheet.create({
  button: {
    backgroundColor: '#c4c4c4',
    borderRadius: 4,
    paddingVertical: 12,
    paddingHorizontal: 32,
  },
  body: {
    justifyContent: 'center',
    alignItems: 'center',
    flex: 1,
  },
  title: {
    fontSize: 20,
    marginBottom: 12,
  },
});
```

## API

### Config
* `setTitle(title)` - set title => title: String
* `setFullScreenOnly(val)` - set fullscreen => val: Boolean
* `setAspectRatio(val)` - set aspect ratio => AspectRatio: String
* `setShowTopBar(SCALE_TYPE)` - set show top bar type => val: Boolean

### Initialize
* `play(url)` - play video => url: String

#### LICENSE
MIT