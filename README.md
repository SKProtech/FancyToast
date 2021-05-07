[![](https://jitpack.io/v/SKProtech/FancyToast.svg)](https://jitpack.io/#SKProtech/FancyToast)

## Prerequisites

Add this in your root build.gradle file (not your module build.gradle file):
```gradle
allprojects {
  repositories {
    ...
    maven { url "https://jitpack.io" }
  }
}
```
## Dependency

Add this to your module's build.gradle file
```gradle
dependencies {
  ...
  implementation 'com.github.SKProtech:FancyToast:1.1.0'
}
```
## Screenshots

<img src="https://github.com/SKProtech/FancyToast/blob/master/Screenshot_20210504-132720.png"/>
<img src="https://github.com/SKProtech/FancyToast/blob/master/Screenshot_20210504-132714.png"/>
<img src="https://github.com/SKProtech/FancyToast/blob/master/Screenshot_20210504-132709.png"/>
<img src="https://github.com/SKProtech/FancyToast/blob/master/Screenshot_20210504-132648.png"/>


## Usage

To display an Success Toast:
```java
FancyTaost.makeText(getApplicationContext(), "Example of Success Toast", FancyTaost.LENGTH_LONG, FancyTaost.SUCCESS).show();
```
To display an Warning Toast:
```java
FancyTaost.makeText(getApplicationContext(), "Example of Warning Toast", FancyTaost.LENGTH_LONG, FancyTaost.WARNING).show();
```
To display an Info Toast:
```java
FancyTaost.makeText(getApplicationContext(), "Example of Info Toast", FancyTaost.LENGTH_LONG, FancyTaost.INFO).show();
```
To display an Error Toast:
```java
FancyTaost.makeText(getApplicationContext(), "Example of Error Toast", FancyTaost.LENGTH_LONG, FancyTaost.ERROR).show();
```

To display a Default Toast:
```java
FancyTaost.makeText(getApplicationContext(), "Example of Default Toast", FancyTaost.LENGTH_LONG, FancyTaost.DEFAULT).show();
```

## Customization

Initialization
```java

FancyTaost.Builder builder = new FancyTaost.Builder();
```
To set custom `Title`
```java
builder.setTitle("Your Custom Title");
```
To set custom `Typeface`
```java
builder.setTypeface(Typeface.SERIF);
```
Or
```java
builder.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/your_font.ttf"));
```

## Contributing

Please fork this repository and contribute back using
[pull requests](https://github.com/SKProtech/FancyToast/pulls).

Any contributions, large or small, major features, bug fixes, are welcomed and appreciated
but will be thoroughly reviewed .

## License

* [Apache Version 2.0](http://www.apache.org/licenses/LICENSE-2.0.html)

```
Copyright 2020 Protech Inc

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

 http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
