
Debian
====================
This directory contains files used to package alnajmd/alnajm-qt
for Debian-based Linux systems. If you compile alnajmd/alnajm-qt yourself, there are some useful files here.

## alnajm: URI support ##


alnajm-qt.desktop  (Gnome / Open Desktop)
To install:

	sudo desktop-file-install alnajm-qt.desktop
	sudo update-desktop-database

If you build yourself, you will either need to modify the paths in
the .desktop file or copy or symlink your alnajm-qt binary to `/usr/bin`
and the `../../share/pixmaps/alnajm128.png` to `/usr/share/pixmaps`

alnajm-qt.protocol (KDE)

