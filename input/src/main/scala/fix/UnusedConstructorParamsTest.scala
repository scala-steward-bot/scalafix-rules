package fix

/*
rule = UnusedConstructorParams
 */
class A1(val x: Int)

class A2(x: Int) // assert: UnusedConstructorParams

class A3(`type`: Int) extends A1(`type`)
