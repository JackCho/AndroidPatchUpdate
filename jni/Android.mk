LOCAL_PATH := $(call my-dir)

include $(CLEAR_VARS)
#bzlib模块
bzlib_files := \
	blocksort.c \
	huffman.c \
	crctable.c \
	randtable.c \
	compress.c \
	decompress.c \
	bzlib.c

LOCAL_MODULE := libbz
LOCAL_SRC_FILES := $(bzlib_files)
include $(BUILD_STATIC_LIBRARY)

#bspath模块
include $(CLEAR_VARS)
LOCAL_MODULE    := bspatch
LOCAL_SRC_FILES := bspatch.c
LOCAL_C_INCLUDES := bspatch.h
LOCAL_STATIC_LIBRARIES := libbz #引入libbz库

include $(BUILD_STATIC_LIBRARY)

include $(CLEAR_VARS)

LOCAL_MODULE    := Patcher
LOCAL_SRC_FILES := Patcher.c 
LOCAL_STATIC_LIBRARIES := bspatch
LOCAL_LDLIBS :=  -llog#加入log

include $(BUILD_SHARED_LIBRARY)
