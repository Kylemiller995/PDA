require('pg')
require_relative('./runner')

class Kyle

  attr_accessor(:eyes, :hair)
  attr_reader(:id)

  def initialize(kyle)
    @id = kyle["id"].to_i()
    @eyes = kyle["eyes"]
    @hair = kyle["hair"]
  end

  def save()
    sql = "INSERT INTO kyle (eyes, hair)
    VALUES
    ($1, $2)
    RETURNING id"
    values = [@eyes, @hair ]
    result = SqlRunner.run(sql, values)
    id = result.first['id']
    @id = id.to_i
  end


  def self.find(id)
    sql = "SELECT * FROM kyle WHERE id = $1"
    values = [id]
    result = SqlRunner.run(sql, values).first
    kyle = Kyle.new(result)
    return kyle
  end

  def self.all
    sql = "SELECT * FROM kyle"
    values = []
    kyle_data = SqlRunner.run(sql, values)
    return Kyle.map_items(kyle_data)
  end

  def self.map_items(kyle_data)
    result = kyle_data.map { |kyle| Kyle.new( kyle ) }
    return result
  end

end
