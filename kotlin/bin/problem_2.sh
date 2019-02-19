#!/bin/bash

DIRECTORY=`pwd $0`/../src
. $DIRECTORY/../env.sh
KSCRIPT=`basename "$0" | sed -e 's/.sh$/.kts/'`
$KOTLINC -script $DIRECTORY/$KSCRIPT 4000000
