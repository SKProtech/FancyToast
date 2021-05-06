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
  implementation 'com.github.SKProtech:FancyToast:1.0.0'
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
