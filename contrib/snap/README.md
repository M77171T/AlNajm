# AlNajm Snap Packaging

Commands for building and uploading a AlNajm Core Snap to the Snap Store. Anyone on amd64 (x86_64), arm64 (aarch64), or i386 (i686) should be able to build it themselves with these instructions. This would pull the official AlNajm binaries from the releases page, verify them, and install them on a user's machine.

## Building Locally
```
sudo apt install snapd
sudo snap install --classic snapcraft
sudo snapcraft
```

### Installing Locally
```
snap install \*.snap --devmode
```

### To Upload to the Snap Store
```
snapcraft login
snapcraft register alnajm-core
snapcraft upload \*.snap
sudo snap install alnajm-core
```

### Usage
```
alnajm-unofficial.cli # for alnajm-cli
alnajm-unofficial.d # for alnajmd
alnajm-unofficial.qt # for alnajm-qt
alnajm-unofficial.test # for test_alnajm
alnajm-unofficial.tx # for alnajm-tx
```

### Uninstalling
```
sudo snap remove alnajm-unofficial
```