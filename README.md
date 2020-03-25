OnePlus-One-Toolkit
===================

Official repository of OnePlus One Toolkit by @manudroid19
![](https://raw.githubusercontent.com/manudroid19/OnePlus-One-Toolkit/master/Captura_v2.0.PNG)

# A tribute to the project, in March 2020.

This was my first Java project, made back in 2014. This information used to be in HTCMania, OnePlus Forums or [XDA-Developers thread](https://forum.xda-developers.com/oneplus-one/development/oneplus-one-toolkit-manudroid19-gui-t2807418):
## Introduction
This is a Graphic User Interface Toolkit for the OnePlus One.

It will allow you to perform all the basic root actions for the OnePlus One easily.


## Features:
* Unlock your device's bootloader
* Lock your device's bootloader
* Root your OnePlus One without installing a custom recovery
* Flash CM11S and ColorOS
* Install ADB drivers
* Install and boot custom recoveries
* Install custom kernels
* Self-install
* Self-update
* Log so you can learn from used commands
* EFS backup & restore


## Future updates:
* Add ROM flashing feature
* Implemet native Java downloader instead of wget
* Add Install apk option
* And more features... Use the "Feature Requests" section.

All of this, from a graphic interface and with a few clics.

## Notes:

* Since I'm not English, I can make mistakes, so PLEASE correct me, even in the thread or in the toolkit.
* I don't have the phone (my order is placed), so I cannot test everything... Please report any bugs... This is my first application..
* Since its a self-extractable file, it can take like 5 sec to start the first time.



## Screenshots:
![](https://raw.githubusercontent.com/manudroid19/OnePlus-One-Toolkit/master/Captura_v2.0.PNG)

## Download:

Installer v2.0: https://www.mediafire.com/?ljkoi4jfz7jj2pi

## Acknowledgements:

@extream87 for EFS backup & restore script
StackOverFlow users, without other people's answer, I wouldn't be able to make this @Chainfire, for creating SuperSU @Mnt-XDA, for creating the bootoloader unlocker @graffixnyc, for packing ColorOS

And other peolple I forgot, for helping me making this, specially to r0i from DarkSideTeam Forums...

## FAQs:
### In which order must I press the buttons? I just want to root my phone...

First of anything,you must unlock your device.
If you are on 25r, you can use method 2 and avoid wiping your data.
If you have 30O or 33R, you must use method 1, and yes, it will wipe your data.
After data, you can just root, install your custom recovery or kernel or do whatever you want..

## Developers info:

### How was the toolkit made??

It's an application completely coded in Java, wich comes with a "tools" folder and it's runned by a hidden BAT to prevent JRE issues. The "tools" folder contains a basic ADB kit, some bat scripts that the application executes for locking and unlocking the bootloader, and a download kit based on wget for Windows.
Everything is contained in a self-executable rar file so there's only one file for users. It extracts himself on c:windowstempOPO Toolkit folder.

### How does the toolkit work??

The application obtains his own path in your computer and from there, it runs the proper bat files to download the neccesary files and perform the desired actions.

### Is posible to port it to other OS?

Yes. The Jar file doesn't need a port, and you just need to port the bat files into bash scripts(linux)

Edit: I've just seen @scumpicule 's toolkit. If he wants, we can colaborate using his scripts for a bigger and better GUI toolkit!! Send me a PM!!

### My antivirus sais it's malware...

There's no malware on this toolkit.
Only false positives detected by a chinese antivirus, possibly because it's a self-extractable RAR file wich extracts himself on "C:WindowsTempOPO_Toolkit". The RAR file runs then the vbs file, which runs the bat file and which runs the JAR file. Maybe that's suspiciuous for the antivirus.

### Why the bat runs the jar? 
Because some Java versions have problems while directly executing a jar.
### Why the vbs runs the bat? 
Becayse if not, a black cmd window appears with the GUI.

The other exe files standard adb, standard fastboot, a wget for windows which I found here and a 7za module from the official webpage.
The bats are simple scripts and you can easy inspect them.

What lasts? The jar.
Whith first stable version, I will release the source code of the GUI application.
BUT if someone recognized in xda or in OP forums is suspicious and wants to look at it now, I will provide it to him.
Is this 100% clean o you want more warraties? Just ask me on the thread. 

## Changelog:
v1.0

.-Initial release

v1.1

-Added "Flash CM11S/ColorOS" option

-Added option to install ADB drivers

-Added option to enter fastboot/recovery mode

-Changed Toolkit's main directory from C:\Windows\Temp to C:\Windows\Temp\OPO Toolkit\

v1.2

-Added option to flash a custom recovery

-Added option to boot a custom recovery

-Fixed a bug wile booting TWRP in Root feature

-Redesigned interface & code cleared

v1.3

-Attemped to fix a bug on Rooting method 2(old method. deprecated until I get the phone)

-Added new easier root method.

Note:Boot recovery & flash recovery options are possibly buggy, please tell me..

v1.3.1

-finally fixed root and recovery boot

v1.4

-added option to flash custom kernels

-added new unlocking bootloader method

v1.4.1

-fixed startup and added Java bad installation warning

v1.5

-Added update engine

-Added installation engine

-Added a drivers installation wizard

-Updated CM11S link.

-Fixed rooting

-Fixed booting recoveries

-Fixed bugs

v1.6

-Quick fix for CM11S flashing bug

-Added option to flash 64 GB partition layout instead of 16 GB one while flashing CM11S

v1.7

-Fixed bug while unlocking -method 2-

-Added log option

-Tried to sign installer so there's no more virus alerts

-Changed CM11S flashing method so there's no more mistakes with partitions

v1.8

-Added EFS Backup & Restore option

-Added option to select file in CM11S & Color OS flashing

-Added support to other languages... Spanish translation started

-Added default kernel & recovery

-Added option to flash 30O OTA

v1.9

-Fully support to other languages, every field can be translated

-Fixed unlock 2nd method bug

-Updated recoveries links (thanks to @katinatez)

-Cleared and improved interface

v2.0

-Added ADB & Fastboot devices list on main menu

-Now toolkit check devices connection before doing anything

-Now toolkit checks if bootloader is unlocked (if needed)

-Added Italian translation

-Added French translation

-Added German translation

-Fixed bug while opening "Final Configuration"

-Updated recovery and kernel links

-Fixed EFS Backup! 
