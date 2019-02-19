#!/bin/bash

. ../env.sh
DIRECTORY=`pwd $0`
KSCRIPT=`basename "$0" | sed -e 's/.sh$/.kts/'`
$KOTLINC -script $DIRECTORY/$KSCRIPT 1000
