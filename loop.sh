#!/bin/sh
mongo 127.0.0.1:27018 --eval "db.stats()"

#while [ "$INPUT_STRING" != "bye" ]
#do
#  echo "Please type something in (bye to quit)"
#  read INPUT_STRING
#  echo "You typed: $INPUT_STRING"
#done


  #!/bin/sh

#mongo --eval "db = connect('127.0.0.1:27018')"

#mongo --eval "db.stats()"  # do a simple harmless command of some sort

RESULT=$?   # returns 0 if mongo eval succeeds

while [ $RESULT -ne 0 ]; then
mongo 127.0.0.1:27018 --eval "db.stats()"
RESULT=$?
else
    echo "mongodb running!"
fi