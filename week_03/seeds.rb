require_relative('./model.rb')

kyle1 = Kyle.new({
  "eyes" => "green",
  "hair" => "red"
  })


kyle2 = Kyle.new({
  "eyes" => "red",
  "hair" => "orange"
  })


kyle3 = Kyle.new({
  "eyes" => "blue",
  "hair" => "purple"
  })


kyle1.save
kyle2.save
kyle3.save

puts found_kyle = Kyle.find(2)

allkyles = Kyle.all
array_of_kyle = []
for kyle in allkyles
  if kyle.hair == "purple"
    array_of_kyle.push(kyle)
  end
end

puts array_of_kyle
