 fun main (){
     var bilBulat: Int = 100
     var bilDesimal: Double = 12.9999
     println(bilBulat)
     println(bilDesimal)

     bilBulat = bilDesimal.toInt()
     println(bilBulat)

      // Type Interface
      val x: Double = 19.5
      val y: Int = 10
      val z: Double = x * y.toDouble()
      val z2:Double = x * y

      println(x)
      println(y)
      println(z)
      println(z2)

      val g = 10 // Ctrl + Shift + P "Untuk informasi tipe data"
      println(g)

      val karakterA: Char = 'a'
      val stringDog = "Dog"
      println(karakterA)
      println(stringDog)
      println("🐩🐕‍🦺🐶🐕")
      println()

      var message = "Hello " + "My name is " + "purity "
      val name = "Paws "
      message += name // message = message + name
      println(message)

      val tandaSeru: Char = '!'
      message += tandaSeru // message = message + tanda seru
      println(message)

      println("// String templates----------------------------------------------------")
      message = "Hello My Name Is purity $name$tandaSeru 😜"
      println(message)
      println()

      val sepertiga = 1.0 / 3.0
      val sepertigaDalamString = "Sepertiga adalah $sepertiga dalam bentuk desimal"
      val sepertigaDalamStringB = "Sepertiga adalah ${1.0 / 3.0} dalam bentuk desimal"
      println(sepertigaDalamString)
      println(sepertigaDalamStringB)
      println()

      println("// Multiline Strings--------------------------------------------------")
      val bigString = """
           |Lorem ipsum
           |ini membuat string
           |dapat 
           |kebawah
      """.trimMargin()
      println(bigString)
      println()

      println("// Pairs dan Tripless-------------------------------------------------")
      val coodinatesPanjang: Pair<Int, Int> = Pair(2, 3)
      val coordinatesLebihPendek = Pair(2, 3)
      val coordinates = 2 to 3
      println(coodinatesPanjang)
      println(coordinatesLebihPendek)
      println(coordinates)

      val coordinatesDoubles = Pair(2.1, 3.5)
      val coodinatesMixed = Pair(2.1, 3)
      println(coordinatesDoubles)
      println(coodinatesMixed)

      val x1 = coordinates.first
      val y1 = coordinates.second
      println(x1)
      println(y1)

      val (x2, y2) = coordinates
      println(x2)
      println(y2)
      println()

      val coodinates3D = Triple(2, 3, 1)
//      val x3 = coodinates3D.first
//      val y3 = coodinates3D.second
//      val z3 = coodinates3D.third
      val (x3, y3, _) = coodinates3D
      println(x3)
      println(y3)

      val a: Short = 12
      val b: Byte = 120
      val c: Int = -100_000
      val hasil = a + b + c
      println(hasil) // jawabannyha akan jadi tipe Int

      // Any, Unit, Nothing
      var anyNumber: Any = 42
      anyNumber = "hallo"
      anyNumber = 4.333
      println(anyNumber)

      var anyString: Any = "42"

      fun add(): Unit {
           val result = 2 + 2
           println(result)
      }

      fun doNothingForever(): Nothing {
           while (true) {

           }
      }
 }