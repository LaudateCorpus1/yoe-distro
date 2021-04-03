#
# Yoe Kiosk image running wpewebkit based browser
#
require yoe-simple-image.bb
require graphics.inc

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

export IMAGE_BASENAME = "yoe-kiosk-image"
# ptest needs a lot of memory
QB_MEM = "-m 1024"
