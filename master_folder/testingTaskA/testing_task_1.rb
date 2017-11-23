### Testing task 1 code:

# Carry out static testing on the code below.
# Read through the code.
# Comment any errors you can see without correcting them.


def func1 val  #no brackets around argument
  if val = 1  #should be ==
  return true
  else
  return false
  end
end

dif max a b #dif not def and arguments not in brackets
  if a > b
      return a #indentation
  else
  b   #indentation and doesnt do anything
  end
end
end #extra end, not needed

def looper
  for i in 1..10 #brackets around range of numbers
  puts i
  end
end

failures = 0

if looper == 10 #looper is a function name not a variable
  puts "looper passed"
else
  puts "looper failed"
  failures = failures + 1  #no end for the if statement


if func1(3) == false  #wont call function properly.
  puts "func1(3) passed"
else
  puts "func1(3) failed"
  failures = failures + 1
end


if max(100,1) == 100  #wont call function properly
  puts "max(100,1) passed"
else
  puts "func1(3) failed"
  failrues = failures + 1 #failrues instead of failures
end


if failures #no condition
  puts "Test Failed"
else
  puts "Test Passed"
end
