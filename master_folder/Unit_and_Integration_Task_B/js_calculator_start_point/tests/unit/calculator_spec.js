var Calculator = require('../../public/js/calculator.js')
var assert = require('assert')

describe('calculator', function () {
  beforeEach(function () {
    calculator = new Calculator()
  });

  // write unit tests here in the form of "it should do something..."
  it('it has a sample test', function(){
    assert.equal(true, true)
  })

  it('should update running total to 1 after numberclick called  ', function() {
    calculator.numberClick(1)
    assert.equal(calculator.runningTotal, 1)
  })

  it('should add 5 ', function() {
    calculator.add(5)
    assert.equal(calculator.runningTotal, 5)
  })

  it('should subtract 5 ', function() {
    calculator.subtract(5)
    assert.equal(calculator.runningTotal, -5)
  })

  it('should multiply 5 by 5 ', function() {
    calculator.previousTotal = 5
    calculator.multiply(5)
    assert.equal(calculator.runningTotal, 25)
  })

  it('should divide 10 by 2 ', function() {
    calculator.previousTotal = 10
    calculator.divide(2)
    assert.equal(calculator.runningTotal, 5)

  })

  it('should concatenate new running total with old  ', function() {
    calculator.numberClick(1)
    calculator.numberClick(3)
    assert.equal(calculator.runningTotal, 13)
  })

  it('should clear runningTotal ', function() {
    calculator.numberClick(1)
    calculator.clearClick()
    assert.equal(calculator.runningTotal, 0)
  })

  it('operators should correctly preform function', function() {
    calculator.numberClick(5)
    calculator.operatorClick('+')
    calculator.numberClick(5)
    calculator.operatorClick('=')
    assert.equal(calculator.runningTotal, 10)
  })

  it('should 3*5 =15  ', function() {
    calculator.numberClick(3)
    calculator.operatorClick('*')
    calculator.numberClick(5)
    calculator.operatorClick('=')
    assert.equal(calculator.runningTotal, 15)
  })

  it('should 21/7 = 3 ', function() {
    calculator.numberClick(21)
    calculator.operatorClick('/')
    calculator.numberClick(7)
    calculator.operatorClick('=')
    assert.equal(calculator.runningTotal, 3)
  })

  it('should 1+4 =5', function() {
    calculator.numberClick(1)
    calculator.operatorClick('+')
    calculator.numberClick(4)
    calculator.operatorClick('=')
    assert.equal(calculator.runningTotal, 5)
  })

  it('should 7-3 = 4', function() {
    calculator.numberClick(7)
    calculator.operatorClick('-')
    calculator.numberClick(4)
    calculator.operatorClick('=')
    assert.equal(calculator.runningTotal, 3)
  })

  it('should chain operators', function() {
    calculator.numberClick(1)
    calculator.operatorClick('+')
    calculator.numberClick(4)
    calculator.operatorClick('+')
    calculator.numberClick(4)
    calculator.operatorClick('=')
    assert.equal(calculator.runningTotal, 9)
  })




});
