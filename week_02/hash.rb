favourite_movie = [
  {
    director: "pedro jackson",
    run_time_minutes: 215,
    title: "lotr"
  },

  {
    director: "",
    run_time_minutes: 215,
    title: ""
  },
  {
    director: "pedro jackson",
    run_time_minutes: 215,
    title: "lotr"
  },
]

def return_director(favourite_movie)
  puts favourite_movie[0][:director]
end

return_director(favourite_movie)
