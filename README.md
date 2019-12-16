# iebis_swdev_exam_debugging
_By Yuval Cole_

## BUG 1 ##
The first bug found was when creating the string buffer. It was feeling it null and therefore it would give a nullPointerException. The correct way to create string buffers is:

  StringBuffer word = new StringBuffer();

## BUG 2 ##

The second bug was equiprobability. The code was randoming 0s and 1s and wasn't taking into account number 2. So I increased the parameter of the random to generate a random number from 0 - 3 without including the 3. 

switch (random.nextInt(3))

## BUG 3 ##

The last bug was it wasn't appending the letters intended but just creating new StringBuffers. After changing it to append I had to break after each case was completed.

 switch (random.nextInt(3)) {
            case 0:
                word = word.append("Y");
                break;
            case 1:
                word = word.append("F");
                break;
            case 2:
                word = word.append("T");
                break;
        }
