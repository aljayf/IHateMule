# openapi-java-client

EdiNation API
- API version: 2
  - Build date: 2023-04-09T20:28:58.440257-10:00[Pacific/Honolulu]

No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)


*Automatically generated by the [OpenAPI Generator](https://openapi-generator.tech)*


## Requirements

Building the API client library requires:
1. Java 1.8+
2. Maven (3.8.3+)/Gradle (7.2+)

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn clean install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn clean deploy
```

Refer to the [OSSRH Guide](http://central.sonatype.org/pages/ossrh-guide.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>org.openapitools</groupId>
  <artifactId>openapi-java-client</artifactId>
  <version>2</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
  repositories {
    mavenCentral()     // Needed if the 'openapi-java-client' jar has been published to maven central.
    mavenLocal()       // Needed if the 'openapi-java-client' jar has been published to the local maven repo.
  }

  dependencies {
     implementation "org.openapitools:openapi-java-client:2"
  }
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

* `target/openapi-java-client-2.jar`
* `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

```

## Documentation for API Endpoints

All URIs are relative to *http://localhost*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------


## Documentation for Models

 - [ABI](docs/ABI.md)
 - [ADT](docs/ADT.md)
 - [APD](docs/APD.md)
 - [ASG](docs/ASG.md)
 - [ATI](docs/ATI.md)
 - [C048](docs/C048.md)
 - [C212](docs/C212.md)
 - [C300](docs/C300.md)
 - [C302](docs/C302.md)
 - [C306](docs/C306.md)
 - [C308](docs/C308.md)
 - [C309](docs/C309.md)
 - [C310](docs/C310.md)
 - [C311](docs/C311.md)
 - [C314](docs/C314.md)
 - [C316](docs/C316.md)
 - [C317](docs/C317.md)
 - [C318](docs/C318.md)
 - [C320](docs/C320.md)
 - [C322](docs/C322.md)
 - [C324](docs/C324.md)
 - [C326](docs/C326.md)
 - [C328](docs/C328.md)
 - [C330](docs/C330.md)
 - [C332](docs/C332.md)
 - [C334](docs/C334.md)
 - [C336](docs/C336.md)
 - [C337](docs/C337.md)
 - [C346](docs/C346.md)
 - [C348](docs/C348.md)
 - [C350](docs/C350.md)
 - [C354](docs/C354.md)
 - [C355](docs/C355.md)
 - [C358](docs/C358.md)
 - [C361](docs/C361.md)
 - [C362](docs/C362.md)
 - [C366](docs/C366.md)
 - [C517](docs/C517.md)
 - [C523](docs/C523.md)
 - [C640](docs/C640.md)
 - [C641](docs/C641.md)
 - [C642](docs/C642.md)
 - [C643](docs/C643.md)
 - [C644](docs/C644.md)
 - [C646](docs/C646.md)
 - [C647](docs/C647.md)
 - [C648](docs/C648.md)
 - [C653](docs/C653.md)
 - [C656](docs/C656.md)
 - [C658](docs/C658.md)
 - [C659](docs/C659.md)
 - [C660](docs/C660.md)
 - [C661](docs/C661.md)
 - [C662](docs/C662.md)
 - [C663](docs/C663.md)
 - [C664](docs/C664.md)
 - [C665](docs/C665.md)
 - [C666](docs/C666.md)
 - [C667](docs/C667.md)
 - [C668](docs/C668.md)
 - [C672](docs/C672.md)
 - [C673](docs/C673.md)
 - [C674](docs/C674.md)
 - [C675](docs/C675.md)
 - [C688](docs/C688.md)
 - [C689](docs/C689.md)
 - [C967](docs/C967.md)
 - [C980](docs/C980.md)
 - [C993](docs/C993.md)
 - [C994](docs/C994.md)
 - [CPN](docs/CPN.md)
 - [CRI](docs/CRI.md)
 - [CVR](docs/CVR.md)
 - [DAT](docs/DAT.md)
 - [DID](docs/DID.md)
 - [EBD](docs/EBD.md)
 - [EDIFACTID0051](docs/EDIFACTID0051.md)
 - [EDIFACTID0113](docs/EDIFACTID0113.md)
 - [EDIFACTID1001](docs/EDIFACTID1001.md)
 - [EDIFACTID1050](docs/EDIFACTID1050.md)
 - [EDIFACTID1131](docs/EDIFACTID1131.md)
 - [EDIFACTID1153](docs/EDIFACTID1153.md)
 - [EDIFACTID1159](docs/EDIFACTID1159.md)
 - [EDIFACTID1225](docs/EDIFACTID1225.md)
 - [EDIFACTID1229](docs/EDIFACTID1229.md)
 - [EDIFACTID1245](docs/EDIFACTID1245.md)
 - [EDIFACTID2005](docs/EDIFACTID2005.md)
 - [EDIFACTID2475](docs/EDIFACTID2475.md)
 - [EDIFACTID3055](docs/EDIFACTID3055.md)
 - [EDIFACTID3207](docs/EDIFACTID3207.md)
 - [EDIFACTID3225](docs/EDIFACTID3225.md)
 - [EDIFACTID3227](docs/EDIFACTID3227.md)
 - [EDIFACTID3453](docs/EDIFACTID3453.md)
 - [EDIFACTID4025](docs/EDIFACTID4025.md)
 - [EDIFACTID4183](docs/EDIFACTID4183.md)
 - [EDIFACTID4343](docs/EDIFACTID4343.md)
 - [EDIFACTID4405](docs/EDIFACTID4405.md)
 - [EDIFACTID4451](docs/EDIFACTID4451.md)
 - [EDIFACTID5007](docs/EDIFACTID5007.md)
 - [EDIFACTID5025](docs/EDIFACTID5025.md)
 - [EDIFACTID5153](docs/EDIFACTID5153.md)
 - [EDIFACTID5237](docs/EDIFACTID5237.md)
 - [EDIFACTID5263](docs/EDIFACTID5263.md)
 - [EDIFACTID5305](docs/EDIFACTID5305.md)
 - [EDIFACTID5387](docs/EDIFACTID5387.md)
 - [EDIFACTID5419](docs/EDIFACTID5419.md)
 - [EDIFACTID5463](docs/EDIFACTID5463.md)
 - [EDIFACTID5479](docs/EDIFACTID5479.md)
 - [EDIFACTID6321](docs/EDIFACTID6321.md)
 - [EDIFACTID6345](docs/EDIFACTID6345.md)
 - [EDIFACTID6353](docs/EDIFACTID6353.md)
 - [EDIFACTID6411](docs/EDIFACTID6411.md)
 - [EDIFACTID7009](docs/EDIFACTID7009.md)
 - [EDIFACTID7037](docs/EDIFACTID7037.md)
 - [EDIFACTID7081](docs/EDIFACTID7081.md)
 - [EDIFACTID7143](docs/EDIFACTID7143.md)
 - [EDIFACTID7164](docs/EDIFACTID7164.md)
 - [EDIFACTID7175](docs/EDIFACTID7175.md)
 - [EDIFACTID7293](docs/EDIFACTID7293.md)
 - [EDIFACTID7365](docs/EDIFACTID7365.md)
 - [EDIFACTID8260](docs/EDIFACTID8260.md)
 - [EDIFACTID8335](docs/EDIFACTID8335.md)
 - [EDIFACTID9011](docs/EDIFACTID9011.md)
 - [EDIFACTID9015](docs/EDIFACTID9015.md)
 - [EDIFACTID9749](docs/EDIFACTID9749.md)
 - [EDIFACTID9750](docs/EDIFACTID9750.md)
 - [EDIFACTID9825](docs/EDIFACTID9825.md)
 - [EDIFACTID9875](docs/EDIFACTID9875.md)
 - [EDIFACTID9888](docs/EDIFACTID9888.md)
 - [EDIFACTID9890](docs/EDIFACTID9890.md)
 - [EDIFACTID9893](docs/EDIFACTID9893.md)
 - [EDIFACTID9906](docs/EDIFACTID9906.md)
 - [EDIFACTID9910](docs/EDIFACTID9910.md)
 - [EDIFACTID9932](docs/EDIFACTID9932.md)
 - [EDIFACTID9946](docs/EDIFACTID9946.md)
 - [EDIFACTID9950](docs/EDIFACTID9950.md)
 - [EDIFACTID9958](docs/EDIFACTID9958.md)
 - [EDIFACTID9960](docs/EDIFACTID9960.md)
 - [EDIFACTID9962](docs/EDIFACTID9962.md)
 - [EDIFACTID9970](docs/EDIFACTID9970.md)
 - [EDIFACTID9972](docs/EDIFACTID9972.md)
 - [EDIFACTID9978](docs/EDIFACTID9978.md)
 - [EDIFACTID9980](docs/EDIFACTID9980.md)
 - [EDIFACTID9988](docs/EDIFACTID9988.md)
 - [EDIFACTID9989](docs/EDIFACTID9989.md)
 - [EQI](docs/EQI.md)
 - [EQN](docs/EQN.md)
 - [FAR](docs/FAR.md)
 - [FCC](docs/FCC.md)
 - [FCI](docs/FCI.md)
 - [FOP](docs/FOP.md)
 - [FQU](docs/FQU.md)
 - [FRU](docs/FRU.md)
 - [FTI](docs/FTI.md)
 - [IFT](docs/IFT.md)
 - [ITM](docs/ITM.md)
 - [Loop10TKTREQ](docs/Loop10TKTREQ.md)
 - [Loop13TKTREQ](docs/Loop13TKTREQ.md)
 - [Loop14TKTREQ](docs/Loop14TKTREQ.md)
 - [Loop15TKTREQ](docs/Loop15TKTREQ.md)
 - [Loop17TKTREQ](docs/Loop17TKTREQ.md)
 - [Loop18TKTREQ](docs/Loop18TKTREQ.md)
 - [Loop1TKTREQ](docs/Loop1TKTREQ.md)
 - [Loop2TKTREQ](docs/Loop2TKTREQ.md)
 - [Loop3TKTREQ](docs/Loop3TKTREQ.md)
 - [Loop4TKTREQ](docs/Loop4TKTREQ.md)
 - [Loop5TKTREQ](docs/Loop5TKTREQ.md)
 - [Loop6TKTREQ](docs/Loop6TKTREQ.md)
 - [Loop7TKTREQ](docs/Loop7TKTREQ.md)
 - [Loop8TKTREQ](docs/Loop8TKTREQ.md)
 - [Loop9TKTREQ](docs/Loop9TKTREQ.md)
 - [LoopABITKTREQ](docs/LoopABITKTREQ.md)
 - [LoopPRTTKTREQ](docs/LoopPRTTKTREQ.md)
 - [LoopREFTKTREQ](docs/LoopREFTKTREQ.md)
 - [LoopTIITKTREQ](docs/LoopTIITKTREQ.md)
 - [LoopTPDTKTREQ](docs/LoopTPDTKTREQ.md)
 - [MON](docs/MON.md)
 - [MSG](docs/MSG.md)
 - [ODI](docs/ODI.md)
 - [ORG](docs/ORG.md)
 - [PRT](docs/PRT.md)
 - [PTK](docs/PTK.md)
 - [PTS](docs/PTS.md)
 - [RCI](docs/RCI.md)
 - [REF](docs/REF.md)
 - [RPI](docs/RPI.md)
 - [RTG](docs/RTG.md)
 - [S009](docs/S009.md)
 - [S010](docs/S010.md)
 - [S016](docs/S016.md)
 - [S017](docs/S017.md)
 - [S018](docs/S018.md)
 - [SDT](docs/SDT.md)
 - [SPI](docs/SPI.md)
 - [SSR](docs/SSR.md)
 - [STX](docs/STX.md)
 - [TAI](docs/TAI.md)
 - [TIF](docs/TIF.md)
 - [TII](docs/TII.md)
 - [TKT](docs/TKT.md)
 - [TPD](docs/TPD.md)
 - [TSTKTREQ](docs/TSTKTREQ.md)
 - [TVL](docs/TVL.md)
 - [TXD](docs/TXD.md)
 - [UNH](docs/UNH.md)
 - [UNT](docs/UNT.md)


## Documentation for Authorization

All endpoints do not require authorization.
Authentication schemes defined for the API:

## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author

