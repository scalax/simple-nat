package net.scalax.simple.adt
package impl

import core._







object InnerTypeAdtClass {
    
        class CusInnerApply1[   I1  ](adtList: AdtList, data: Any) {
            @inline def fold[T](   func1: I1 => T  ): T = {
                var getValue: Any = null
                adtList.method1(  new FoldListPositive(  FoldList.zero ) with TypeAdtGetter {
    override def runGetter: Unit = getValue = func1.asInstanceOf[Any => Any](data)
} )
                getValue.asInstanceOf[T]
            }
        }
        object HelperIOImpl1 extends HelperIO[Any] {
            override type Out = CusInnerApply1[   Any  ]
            @inline override def helper(adtList: AdtList, data: Any): CusInnerApply1[   Any  ] = new CusInnerApply1(adtList, data)
        }
    
        class CusInnerApply2[   I1   ,  I2  ](adtList: AdtList, data: Any) {
            @inline def fold[T](   func1: I1 => T   ,  func2: I2 => T  ): T = {
                var getValue: Any = null
                adtList.method1(  new FoldListPositive(  new FoldListPositive(  FoldList.zero ) with TypeAdtGetter {
    override def runGetter: Unit = getValue = func2.asInstanceOf[Any => Any](data)
} ) with TypeAdtGetter {
    override def runGetter: Unit = getValue = func1.asInstanceOf[Any => Any](data)
} )
                getValue.asInstanceOf[T]
            }
        }
        object HelperIOImpl2 extends HelperIO[Any] {
            override type Out = CusInnerApply2[   Any   ,  Any  ]
            @inline override def helper(adtList: AdtList, data: Any): CusInnerApply2[   Any   ,  Any  ] = new CusInnerApply2(adtList, data)
        }
    
        class CusInnerApply3[   I1   ,  I2   ,  I3  ](adtList: AdtList, data: Any) {
            @inline def fold[T](   func1: I1 => T   ,  func2: I2 => T   ,  func3: I3 => T  ): T = {
                var getValue: Any = null
                adtList.method1(  new FoldListPositive(  new FoldListPositive(  new FoldListPositive(  FoldList.zero ) with TypeAdtGetter {
    override def runGetter: Unit = getValue = func3.asInstanceOf[Any => Any](data)
} ) with TypeAdtGetter {
    override def runGetter: Unit = getValue = func2.asInstanceOf[Any => Any](data)
} ) with TypeAdtGetter {
    override def runGetter: Unit = getValue = func1.asInstanceOf[Any => Any](data)
} )
                getValue.asInstanceOf[T]
            }
        }
        object HelperIOImpl3 extends HelperIO[Any] {
            override type Out = CusInnerApply3[   Any   ,  Any   ,  Any  ]
            @inline override def helper(adtList: AdtList, data: Any): CusInnerApply3[   Any   ,  Any   ,  Any  ] = new CusInnerApply3(adtList, data)
        }
    
        class CusInnerApply4[   I1   ,  I2   ,  I3   ,  I4  ](adtList: AdtList, data: Any) {
            @inline def fold[T](   func1: I1 => T   ,  func2: I2 => T   ,  func3: I3 => T   ,  func4: I4 => T  ): T = {
                var getValue: Any = null
                adtList.method1(  new FoldListPositive(  new FoldListPositive(  new FoldListPositive(  new FoldListPositive(  FoldList.zero ) with TypeAdtGetter {
    override def runGetter: Unit = getValue = func4.asInstanceOf[Any => Any](data)
} ) with TypeAdtGetter {
    override def runGetter: Unit = getValue = func3.asInstanceOf[Any => Any](data)
} ) with TypeAdtGetter {
    override def runGetter: Unit = getValue = func2.asInstanceOf[Any => Any](data)
} ) with TypeAdtGetter {
    override def runGetter: Unit = getValue = func1.asInstanceOf[Any => Any](data)
} )
                getValue.asInstanceOf[T]
            }
        }
        object HelperIOImpl4 extends HelperIO[Any] {
            override type Out = CusInnerApply4[   Any   ,  Any   ,  Any   ,  Any  ]
            @inline override def helper(adtList: AdtList, data: Any): CusInnerApply4[   Any   ,  Any   ,  Any   ,  Any  ] = new CusInnerApply4(adtList, data)
        }
    
        class CusInnerApply5[   I1   ,  I2   ,  I3   ,  I4   ,  I5  ](adtList: AdtList, data: Any) {
            @inline def fold[T](   func1: I1 => T   ,  func2: I2 => T   ,  func3: I3 => T   ,  func4: I4 => T   ,  func5: I5 => T  ): T = {
                var getValue: Any = null
                adtList.method1(  new FoldListPositive(  new FoldListPositive(  new FoldListPositive(  new FoldListPositive(  new FoldListPositive(  FoldList.zero ) with TypeAdtGetter {
    override def runGetter: Unit = getValue = func5.asInstanceOf[Any => Any](data)
} ) with TypeAdtGetter {
    override def runGetter: Unit = getValue = func4.asInstanceOf[Any => Any](data)
} ) with TypeAdtGetter {
    override def runGetter: Unit = getValue = func3.asInstanceOf[Any => Any](data)
} ) with TypeAdtGetter {
    override def runGetter: Unit = getValue = func2.asInstanceOf[Any => Any](data)
} ) with TypeAdtGetter {
    override def runGetter: Unit = getValue = func1.asInstanceOf[Any => Any](data)
} )
                getValue.asInstanceOf[T]
            }
        }
        object HelperIOImpl5 extends HelperIO[Any] {
            override type Out = CusInnerApply5[   Any   ,  Any   ,  Any   ,  Any   ,  Any  ]
            @inline override def helper(adtList: AdtList, data: Any): CusInnerApply5[   Any   ,  Any   ,  Any   ,  Any   ,  Any  ] = new CusInnerApply5(adtList, data)
        }
    
        class CusInnerApply6[   I1   ,  I2   ,  I3   ,  I4   ,  I5   ,  I6  ](adtList: AdtList, data: Any) {
            @inline def fold[T](   func1: I1 => T   ,  func2: I2 => T   ,  func3: I3 => T   ,  func4: I4 => T   ,  func5: I5 => T   ,  func6: I6 => T  ): T = {
                var getValue: Any = null
                adtList.method1(  new FoldListPositive(  new FoldListPositive(  new FoldListPositive(  new FoldListPositive(  new FoldListPositive(  new FoldListPositive(  FoldList.zero ) with TypeAdtGetter {
    override def runGetter: Unit = getValue = func6.asInstanceOf[Any => Any](data)
} ) with TypeAdtGetter {
    override def runGetter: Unit = getValue = func5.asInstanceOf[Any => Any](data)
} ) with TypeAdtGetter {
    override def runGetter: Unit = getValue = func4.asInstanceOf[Any => Any](data)
} ) with TypeAdtGetter {
    override def runGetter: Unit = getValue = func3.asInstanceOf[Any => Any](data)
} ) with TypeAdtGetter {
    override def runGetter: Unit = getValue = func2.asInstanceOf[Any => Any](data)
} ) with TypeAdtGetter {
    override def runGetter: Unit = getValue = func1.asInstanceOf[Any => Any](data)
} )
                getValue.asInstanceOf[T]
            }
        }
        object HelperIOImpl6 extends HelperIO[Any] {
            override type Out = CusInnerApply6[   Any   ,  Any   ,  Any   ,  Any   ,  Any   ,  Any  ]
            @inline override def helper(adtList: AdtList, data: Any): CusInnerApply6[   Any   ,  Any   ,  Any   ,  Any   ,  Any   ,  Any  ] = new CusInnerApply6(adtList, data)
        }
    
        class CusInnerApply7[   I1   ,  I2   ,  I3   ,  I4   ,  I5   ,  I6   ,  I7  ](adtList: AdtList, data: Any) {
            @inline def fold[T](   func1: I1 => T   ,  func2: I2 => T   ,  func3: I3 => T   ,  func4: I4 => T   ,  func5: I5 => T   ,  func6: I6 => T   ,  func7: I7 => T  ): T = {
                var getValue: Any = null
                adtList.method1(  new FoldListPositive(  new FoldListPositive(  new FoldListPositive(  new FoldListPositive(  new FoldListPositive(  new FoldListPositive(  new FoldListPositive(  FoldList.zero ) with TypeAdtGetter {
    override def runGetter: Unit = getValue = func7.asInstanceOf[Any => Any](data)
} ) with TypeAdtGetter {
    override def runGetter: Unit = getValue = func6.asInstanceOf[Any => Any](data)
} ) with TypeAdtGetter {
    override def runGetter: Unit = getValue = func5.asInstanceOf[Any => Any](data)
} ) with TypeAdtGetter {
    override def runGetter: Unit = getValue = func4.asInstanceOf[Any => Any](data)
} ) with TypeAdtGetter {
    override def runGetter: Unit = getValue = func3.asInstanceOf[Any => Any](data)
} ) with TypeAdtGetter {
    override def runGetter: Unit = getValue = func2.asInstanceOf[Any => Any](data)
} ) with TypeAdtGetter {
    override def runGetter: Unit = getValue = func1.asInstanceOf[Any => Any](data)
} )
                getValue.asInstanceOf[T]
            }
        }
        object HelperIOImpl7 extends HelperIO[Any] {
            override type Out = CusInnerApply7[   Any   ,  Any   ,  Any   ,  Any   ,  Any   ,  Any   ,  Any  ]
            @inline override def helper(adtList: AdtList, data: Any): CusInnerApply7[   Any   ,  Any   ,  Any   ,  Any   ,  Any   ,  Any   ,  Any  ] = new CusInnerApply7(adtList, data)
        }
    
        class CusInnerApply8[   I1   ,  I2   ,  I3   ,  I4   ,  I5   ,  I6   ,  I7   ,  I8  ](adtList: AdtList, data: Any) {
            @inline def fold[T](   func1: I1 => T   ,  func2: I2 => T   ,  func3: I3 => T   ,  func4: I4 => T   ,  func5: I5 => T   ,  func6: I6 => T   ,  func7: I7 => T   ,  func8: I8 => T  ): T = {
                var getValue: Any = null
                adtList.method1(  new FoldListPositive(  new FoldListPositive(  new FoldListPositive(  new FoldListPositive(  new FoldListPositive(  new FoldListPositive(  new FoldListPositive(  new FoldListPositive(  FoldList.zero ) with TypeAdtGetter {
    override def runGetter: Unit = getValue = func8.asInstanceOf[Any => Any](data)
} ) with TypeAdtGetter {
    override def runGetter: Unit = getValue = func7.asInstanceOf[Any => Any](data)
} ) with TypeAdtGetter {
    override def runGetter: Unit = getValue = func6.asInstanceOf[Any => Any](data)
} ) with TypeAdtGetter {
    override def runGetter: Unit = getValue = func5.asInstanceOf[Any => Any](data)
} ) with TypeAdtGetter {
    override def runGetter: Unit = getValue = func4.asInstanceOf[Any => Any](data)
} ) with TypeAdtGetter {
    override def runGetter: Unit = getValue = func3.asInstanceOf[Any => Any](data)
} ) with TypeAdtGetter {
    override def runGetter: Unit = getValue = func2.asInstanceOf[Any => Any](data)
} ) with TypeAdtGetter {
    override def runGetter: Unit = getValue = func1.asInstanceOf[Any => Any](data)
} )
                getValue.asInstanceOf[T]
            }
        }
        object HelperIOImpl8 extends HelperIO[Any] {
            override type Out = CusInnerApply8[   Any   ,  Any   ,  Any   ,  Any   ,  Any   ,  Any   ,  Any   ,  Any  ]
            @inline override def helper(adtList: AdtList, data: Any): CusInnerApply8[   Any   ,  Any   ,  Any   ,  Any   ,  Any   ,  Any   ,  Any   ,  Any  ] = new CusInnerApply8(adtList, data)
        }
    
        class CusInnerApply9[   I1   ,  I2   ,  I3   ,  I4   ,  I5   ,  I6   ,  I7   ,  I8   ,  I9  ](adtList: AdtList, data: Any) {
            @inline def fold[T](   func1: I1 => T   ,  func2: I2 => T   ,  func3: I3 => T   ,  func4: I4 => T   ,  func5: I5 => T   ,  func6: I6 => T   ,  func7: I7 => T   ,  func8: I8 => T   ,  func9: I9 => T  ): T = {
                var getValue: Any = null
                adtList.method1(  new FoldListPositive(  new FoldListPositive(  new FoldListPositive(  new FoldListPositive(  new FoldListPositive(  new FoldListPositive(  new FoldListPositive(  new FoldListPositive(  new FoldListPositive(  FoldList.zero ) with TypeAdtGetter {
    override def runGetter: Unit = getValue = func9.asInstanceOf[Any => Any](data)
} ) with TypeAdtGetter {
    override def runGetter: Unit = getValue = func8.asInstanceOf[Any => Any](data)
} ) with TypeAdtGetter {
    override def runGetter: Unit = getValue = func7.asInstanceOf[Any => Any](data)
} ) with TypeAdtGetter {
    override def runGetter: Unit = getValue = func6.asInstanceOf[Any => Any](data)
} ) with TypeAdtGetter {
    override def runGetter: Unit = getValue = func5.asInstanceOf[Any => Any](data)
} ) with TypeAdtGetter {
    override def runGetter: Unit = getValue = func4.asInstanceOf[Any => Any](data)
} ) with TypeAdtGetter {
    override def runGetter: Unit = getValue = func3.asInstanceOf[Any => Any](data)
} ) with TypeAdtGetter {
    override def runGetter: Unit = getValue = func2.asInstanceOf[Any => Any](data)
} ) with TypeAdtGetter {
    override def runGetter: Unit = getValue = func1.asInstanceOf[Any => Any](data)
} )
                getValue.asInstanceOf[T]
            }
        }
        object HelperIOImpl9 extends HelperIO[Any] {
            override type Out = CusInnerApply9[   Any   ,  Any   ,  Any   ,  Any   ,  Any   ,  Any   ,  Any   ,  Any   ,  Any  ]
            @inline override def helper(adtList: AdtList, data: Any): CusInnerApply9[   Any   ,  Any   ,  Any   ,  Any   ,  Any   ,  Any   ,  Any   ,  Any   ,  Any  ] = new CusInnerApply9(adtList, data)
        }
    
        class CusInnerApply10[   I1   ,  I2   ,  I3   ,  I4   ,  I5   ,  I6   ,  I7   ,  I8   ,  I9   ,  I10  ](adtList: AdtList, data: Any) {
            @inline def fold[T](   func1: I1 => T   ,  func2: I2 => T   ,  func3: I3 => T   ,  func4: I4 => T   ,  func5: I5 => T   ,  func6: I6 => T   ,  func7: I7 => T   ,  func8: I8 => T   ,  func9: I9 => T   ,  func10: I10 => T  ): T = {
                var getValue: Any = null
                adtList.method1(  new FoldListPositive(  new FoldListPositive(  new FoldListPositive(  new FoldListPositive(  new FoldListPositive(  new FoldListPositive(  new FoldListPositive(  new FoldListPositive(  new FoldListPositive(  new FoldListPositive(  FoldList.zero ) with TypeAdtGetter {
    override def runGetter: Unit = getValue = func10.asInstanceOf[Any => Any](data)
} ) with TypeAdtGetter {
    override def runGetter: Unit = getValue = func9.asInstanceOf[Any => Any](data)
} ) with TypeAdtGetter {
    override def runGetter: Unit = getValue = func8.asInstanceOf[Any => Any](data)
} ) with TypeAdtGetter {
    override def runGetter: Unit = getValue = func7.asInstanceOf[Any => Any](data)
} ) with TypeAdtGetter {
    override def runGetter: Unit = getValue = func6.asInstanceOf[Any => Any](data)
} ) with TypeAdtGetter {
    override def runGetter: Unit = getValue = func5.asInstanceOf[Any => Any](data)
} ) with TypeAdtGetter {
    override def runGetter: Unit = getValue = func4.asInstanceOf[Any => Any](data)
} ) with TypeAdtGetter {
    override def runGetter: Unit = getValue = func3.asInstanceOf[Any => Any](data)
} ) with TypeAdtGetter {
    override def runGetter: Unit = getValue = func2.asInstanceOf[Any => Any](data)
} ) with TypeAdtGetter {
    override def runGetter: Unit = getValue = func1.asInstanceOf[Any => Any](data)
} )
                getValue.asInstanceOf[T]
            }
        }
        object HelperIOImpl10 extends HelperIO[Any] {
            override type Out = CusInnerApply10[   Any   ,  Any   ,  Any   ,  Any   ,  Any   ,  Any   ,  Any   ,  Any   ,  Any   ,  Any  ]
            @inline override def helper(adtList: AdtList, data: Any): CusInnerApply10[   Any   ,  Any   ,  Any   ,  Any   ,  Any   ,  Any   ,  Any   ,  Any   ,  Any   ,  Any  ] = new CusInnerApply10(adtList, data)
        }
    
        class CusInnerApply11[   I1   ,  I2   ,  I3   ,  I4   ,  I5   ,  I6   ,  I7   ,  I8   ,  I9   ,  I10   ,  I11  ](adtList: AdtList, data: Any) {
            @inline def fold[T](   func1: I1 => T   ,  func2: I2 => T   ,  func3: I3 => T   ,  func4: I4 => T   ,  func5: I5 => T   ,  func6: I6 => T   ,  func7: I7 => T   ,  func8: I8 => T   ,  func9: I9 => T   ,  func10: I10 => T   ,  func11: I11 => T  ): T = {
                var getValue: Any = null
                adtList.method1(  new FoldListPositive(  new FoldListPositive(  new FoldListPositive(  new FoldListPositive(  new FoldListPositive(  new FoldListPositive(  new FoldListPositive(  new FoldListPositive(  new FoldListPositive(  new FoldListPositive(  new FoldListPositive(  FoldList.zero ) with TypeAdtGetter {
    override def runGetter: Unit = getValue = func11.asInstanceOf[Any => Any](data)
} ) with TypeAdtGetter {
    override def runGetter: Unit = getValue = func10.asInstanceOf[Any => Any](data)
} ) with TypeAdtGetter {
    override def runGetter: Unit = getValue = func9.asInstanceOf[Any => Any](data)
} ) with TypeAdtGetter {
    override def runGetter: Unit = getValue = func8.asInstanceOf[Any => Any](data)
} ) with TypeAdtGetter {
    override def runGetter: Unit = getValue = func7.asInstanceOf[Any => Any](data)
} ) with TypeAdtGetter {
    override def runGetter: Unit = getValue = func6.asInstanceOf[Any => Any](data)
} ) with TypeAdtGetter {
    override def runGetter: Unit = getValue = func5.asInstanceOf[Any => Any](data)
} ) with TypeAdtGetter {
    override def runGetter: Unit = getValue = func4.asInstanceOf[Any => Any](data)
} ) with TypeAdtGetter {
    override def runGetter: Unit = getValue = func3.asInstanceOf[Any => Any](data)
} ) with TypeAdtGetter {
    override def runGetter: Unit = getValue = func2.asInstanceOf[Any => Any](data)
} ) with TypeAdtGetter {
    override def runGetter: Unit = getValue = func1.asInstanceOf[Any => Any](data)
} )
                getValue.asInstanceOf[T]
            }
        }
        object HelperIOImpl11 extends HelperIO[Any] {
            override type Out = CusInnerApply11[   Any   ,  Any   ,  Any   ,  Any   ,  Any   ,  Any   ,  Any   ,  Any   ,  Any   ,  Any   ,  Any  ]
            @inline override def helper(adtList: AdtList, data: Any): CusInnerApply11[   Any   ,  Any   ,  Any   ,  Any   ,  Any   ,  Any   ,  Any   ,  Any   ,  Any   ,  Any   ,  Any  ] = new CusInnerApply11(adtList, data)
        }
    
        class CusInnerApply12[   I1   ,  I2   ,  I3   ,  I4   ,  I5   ,  I6   ,  I7   ,  I8   ,  I9   ,  I10   ,  I11   ,  I12  ](adtList: AdtList, data: Any) {
            @inline def fold[T](   func1: I1 => T   ,  func2: I2 => T   ,  func3: I3 => T   ,  func4: I4 => T   ,  func5: I5 => T   ,  func6: I6 => T   ,  func7: I7 => T   ,  func8: I8 => T   ,  func9: I9 => T   ,  func10: I10 => T   ,  func11: I11 => T   ,  func12: I12 => T  ): T = {
                var getValue: Any = null
                adtList.method1(  new FoldListPositive(  new FoldListPositive(  new FoldListPositive(  new FoldListPositive(  new FoldListPositive(  new FoldListPositive(  new FoldListPositive(  new FoldListPositive(  new FoldListPositive(  new FoldListPositive(  new FoldListPositive(  new FoldListPositive(  FoldList.zero ) with TypeAdtGetter {
    override def runGetter: Unit = getValue = func12.asInstanceOf[Any => Any](data)
} ) with TypeAdtGetter {
    override def runGetter: Unit = getValue = func11.asInstanceOf[Any => Any](data)
} ) with TypeAdtGetter {
    override def runGetter: Unit = getValue = func10.asInstanceOf[Any => Any](data)
} ) with TypeAdtGetter {
    override def runGetter: Unit = getValue = func9.asInstanceOf[Any => Any](data)
} ) with TypeAdtGetter {
    override def runGetter: Unit = getValue = func8.asInstanceOf[Any => Any](data)
} ) with TypeAdtGetter {
    override def runGetter: Unit = getValue = func7.asInstanceOf[Any => Any](data)
} ) with TypeAdtGetter {
    override def runGetter: Unit = getValue = func6.asInstanceOf[Any => Any](data)
} ) with TypeAdtGetter {
    override def runGetter: Unit = getValue = func5.asInstanceOf[Any => Any](data)
} ) with TypeAdtGetter {
    override def runGetter: Unit = getValue = func4.asInstanceOf[Any => Any](data)
} ) with TypeAdtGetter {
    override def runGetter: Unit = getValue = func3.asInstanceOf[Any => Any](data)
} ) with TypeAdtGetter {
    override def runGetter: Unit = getValue = func2.asInstanceOf[Any => Any](data)
} ) with TypeAdtGetter {
    override def runGetter: Unit = getValue = func1.asInstanceOf[Any => Any](data)
} )
                getValue.asInstanceOf[T]
            }
        }
        object HelperIOImpl12 extends HelperIO[Any] {
            override type Out = CusInnerApply12[   Any   ,  Any   ,  Any   ,  Any   ,  Any   ,  Any   ,  Any   ,  Any   ,  Any   ,  Any   ,  Any   ,  Any  ]
            @inline override def helper(adtList: AdtList, data: Any): CusInnerApply12[   Any   ,  Any   ,  Any   ,  Any   ,  Any   ,  Any   ,  Any   ,  Any   ,  Any   ,  Any   ,  Any   ,  Any  ] = new CusInnerApply12(adtList, data)
        }
    
        class CusInnerApply13[   I1   ,  I2   ,  I3   ,  I4   ,  I5   ,  I6   ,  I7   ,  I8   ,  I9   ,  I10   ,  I11   ,  I12   ,  I13  ](adtList: AdtList, data: Any) {
            @inline def fold[T](   func1: I1 => T   ,  func2: I2 => T   ,  func3: I3 => T   ,  func4: I4 => T   ,  func5: I5 => T   ,  func6: I6 => T   ,  func7: I7 => T   ,  func8: I8 => T   ,  func9: I9 => T   ,  func10: I10 => T   ,  func11: I11 => T   ,  func12: I12 => T   ,  func13: I13 => T  ): T = {
                var getValue: Any = null
                adtList.method1(  new FoldListPositive(  new FoldListPositive(  new FoldListPositive(  new FoldListPositive(  new FoldListPositive(  new FoldListPositive(  new FoldListPositive(  new FoldListPositive(  new FoldListPositive(  new FoldListPositive(  new FoldListPositive(  new FoldListPositive(  new FoldListPositive(  FoldList.zero ) with TypeAdtGetter {
    override def runGetter: Unit = getValue = func13.asInstanceOf[Any => Any](data)
} ) with TypeAdtGetter {
    override def runGetter: Unit = getValue = func12.asInstanceOf[Any => Any](data)
} ) with TypeAdtGetter {
    override def runGetter: Unit = getValue = func11.asInstanceOf[Any => Any](data)
} ) with TypeAdtGetter {
    override def runGetter: Unit = getValue = func10.asInstanceOf[Any => Any](data)
} ) with TypeAdtGetter {
    override def runGetter: Unit = getValue = func9.asInstanceOf[Any => Any](data)
} ) with TypeAdtGetter {
    override def runGetter: Unit = getValue = func8.asInstanceOf[Any => Any](data)
} ) with TypeAdtGetter {
    override def runGetter: Unit = getValue = func7.asInstanceOf[Any => Any](data)
} ) with TypeAdtGetter {
    override def runGetter: Unit = getValue = func6.asInstanceOf[Any => Any](data)
} ) with TypeAdtGetter {
    override def runGetter: Unit = getValue = func5.asInstanceOf[Any => Any](data)
} ) with TypeAdtGetter {
    override def runGetter: Unit = getValue = func4.asInstanceOf[Any => Any](data)
} ) with TypeAdtGetter {
    override def runGetter: Unit = getValue = func3.asInstanceOf[Any => Any](data)
} ) with TypeAdtGetter {
    override def runGetter: Unit = getValue = func2.asInstanceOf[Any => Any](data)
} ) with TypeAdtGetter {
    override def runGetter: Unit = getValue = func1.asInstanceOf[Any => Any](data)
} )
                getValue.asInstanceOf[T]
            }
        }
        object HelperIOImpl13 extends HelperIO[Any] {
            override type Out = CusInnerApply13[   Any   ,  Any   ,  Any   ,  Any   ,  Any   ,  Any   ,  Any   ,  Any   ,  Any   ,  Any   ,  Any   ,  Any   ,  Any  ]
            @inline override def helper(adtList: AdtList, data: Any): CusInnerApply13[   Any   ,  Any   ,  Any   ,  Any   ,  Any   ,  Any   ,  Any   ,  Any   ,  Any   ,  Any   ,  Any   ,  Any   ,  Any  ] = new CusInnerApply13(adtList, data)
        }
    
        class CusInnerApply14[   I1   ,  I2   ,  I3   ,  I4   ,  I5   ,  I6   ,  I7   ,  I8   ,  I9   ,  I10   ,  I11   ,  I12   ,  I13   ,  I14  ](adtList: AdtList, data: Any) {
            @inline def fold[T](   func1: I1 => T   ,  func2: I2 => T   ,  func3: I3 => T   ,  func4: I4 => T   ,  func5: I5 => T   ,  func6: I6 => T   ,  func7: I7 => T   ,  func8: I8 => T   ,  func9: I9 => T   ,  func10: I10 => T   ,  func11: I11 => T   ,  func12: I12 => T   ,  func13: I13 => T   ,  func14: I14 => T  ): T = {
                var getValue: Any = null
                adtList.method1(  new FoldListPositive(  new FoldListPositive(  new FoldListPositive(  new FoldListPositive(  new FoldListPositive(  new FoldListPositive(  new FoldListPositive(  new FoldListPositive(  new FoldListPositive(  new FoldListPositive(  new FoldListPositive(  new FoldListPositive(  new FoldListPositive(  new FoldListPositive(  FoldList.zero ) with TypeAdtGetter {
    override def runGetter: Unit = getValue = func14.asInstanceOf[Any => Any](data)
} ) with TypeAdtGetter {
    override def runGetter: Unit = getValue = func13.asInstanceOf[Any => Any](data)
} ) with TypeAdtGetter {
    override def runGetter: Unit = getValue = func12.asInstanceOf[Any => Any](data)
} ) with TypeAdtGetter {
    override def runGetter: Unit = getValue = func11.asInstanceOf[Any => Any](data)
} ) with TypeAdtGetter {
    override def runGetter: Unit = getValue = func10.asInstanceOf[Any => Any](data)
} ) with TypeAdtGetter {
    override def runGetter: Unit = getValue = func9.asInstanceOf[Any => Any](data)
} ) with TypeAdtGetter {
    override def runGetter: Unit = getValue = func8.asInstanceOf[Any => Any](data)
} ) with TypeAdtGetter {
    override def runGetter: Unit = getValue = func7.asInstanceOf[Any => Any](data)
} ) with TypeAdtGetter {
    override def runGetter: Unit = getValue = func6.asInstanceOf[Any => Any](data)
} ) with TypeAdtGetter {
    override def runGetter: Unit = getValue = func5.asInstanceOf[Any => Any](data)
} ) with TypeAdtGetter {
    override def runGetter: Unit = getValue = func4.asInstanceOf[Any => Any](data)
} ) with TypeAdtGetter {
    override def runGetter: Unit = getValue = func3.asInstanceOf[Any => Any](data)
} ) with TypeAdtGetter {
    override def runGetter: Unit = getValue = func2.asInstanceOf[Any => Any](data)
} ) with TypeAdtGetter {
    override def runGetter: Unit = getValue = func1.asInstanceOf[Any => Any](data)
} )
                getValue.asInstanceOf[T]
            }
        }
        object HelperIOImpl14 extends HelperIO[Any] {
            override type Out = CusInnerApply14[   Any   ,  Any   ,  Any   ,  Any   ,  Any   ,  Any   ,  Any   ,  Any   ,  Any   ,  Any   ,  Any   ,  Any   ,  Any   ,  Any  ]
            @inline override def helper(adtList: AdtList, data: Any): CusInnerApply14[   Any   ,  Any   ,  Any   ,  Any   ,  Any   ,  Any   ,  Any   ,  Any   ,  Any   ,  Any   ,  Any   ,  Any   ,  Any   ,  Any  ] = new CusInnerApply14(adtList, data)
        }
    
        class CusInnerApply15[   I1   ,  I2   ,  I3   ,  I4   ,  I5   ,  I6   ,  I7   ,  I8   ,  I9   ,  I10   ,  I11   ,  I12   ,  I13   ,  I14   ,  I15  ](adtList: AdtList, data: Any) {
            @inline def fold[T](   func1: I1 => T   ,  func2: I2 => T   ,  func3: I3 => T   ,  func4: I4 => T   ,  func5: I5 => T   ,  func6: I6 => T   ,  func7: I7 => T   ,  func8: I8 => T   ,  func9: I9 => T   ,  func10: I10 => T   ,  func11: I11 => T   ,  func12: I12 => T   ,  func13: I13 => T   ,  func14: I14 => T   ,  func15: I15 => T  ): T = {
                var getValue: Any = null
                adtList.method1(  new FoldListPositive(  new FoldListPositive(  new FoldListPositive(  new FoldListPositive(  new FoldListPositive(  new FoldListPositive(  new FoldListPositive(  new FoldListPositive(  new FoldListPositive(  new FoldListPositive(  new FoldListPositive(  new FoldListPositive(  new FoldListPositive(  new FoldListPositive(  new FoldListPositive(  FoldList.zero ) with TypeAdtGetter {
    override def runGetter: Unit = getValue = func15.asInstanceOf[Any => Any](data)
} ) with TypeAdtGetter {
    override def runGetter: Unit = getValue = func14.asInstanceOf[Any => Any](data)
} ) with TypeAdtGetter {
    override def runGetter: Unit = getValue = func13.asInstanceOf[Any => Any](data)
} ) with TypeAdtGetter {
    override def runGetter: Unit = getValue = func12.asInstanceOf[Any => Any](data)
} ) with TypeAdtGetter {
    override def runGetter: Unit = getValue = func11.asInstanceOf[Any => Any](data)
} ) with TypeAdtGetter {
    override def runGetter: Unit = getValue = func10.asInstanceOf[Any => Any](data)
} ) with TypeAdtGetter {
    override def runGetter: Unit = getValue = func9.asInstanceOf[Any => Any](data)
} ) with TypeAdtGetter {
    override def runGetter: Unit = getValue = func8.asInstanceOf[Any => Any](data)
} ) with TypeAdtGetter {
    override def runGetter: Unit = getValue = func7.asInstanceOf[Any => Any](data)
} ) with TypeAdtGetter {
    override def runGetter: Unit = getValue = func6.asInstanceOf[Any => Any](data)
} ) with TypeAdtGetter {
    override def runGetter: Unit = getValue = func5.asInstanceOf[Any => Any](data)
} ) with TypeAdtGetter {
    override def runGetter: Unit = getValue = func4.asInstanceOf[Any => Any](data)
} ) with TypeAdtGetter {
    override def runGetter: Unit = getValue = func3.asInstanceOf[Any => Any](data)
} ) with TypeAdtGetter {
    override def runGetter: Unit = getValue = func2.asInstanceOf[Any => Any](data)
} ) with TypeAdtGetter {
    override def runGetter: Unit = getValue = func1.asInstanceOf[Any => Any](data)
} )
                getValue.asInstanceOf[T]
            }
        }
        object HelperIOImpl15 extends HelperIO[Any] {
            override type Out = CusInnerApply15[   Any   ,  Any   ,  Any   ,  Any   ,  Any   ,  Any   ,  Any   ,  Any   ,  Any   ,  Any   ,  Any   ,  Any   ,  Any   ,  Any   ,  Any  ]
            @inline override def helper(adtList: AdtList, data: Any): CusInnerApply15[   Any   ,  Any   ,  Any   ,  Any   ,  Any   ,  Any   ,  Any   ,  Any   ,  Any   ,  Any   ,  Any   ,  Any   ,  Any   ,  Any   ,  Any  ] = new CusInnerApply15(adtList, data)
        }
    
        class CusInnerApply16[   I1   ,  I2   ,  I3   ,  I4   ,  I5   ,  I6   ,  I7   ,  I8   ,  I9   ,  I10   ,  I11   ,  I12   ,  I13   ,  I14   ,  I15   ,  I16  ](adtList: AdtList, data: Any) {
            @inline def fold[T](   func1: I1 => T   ,  func2: I2 => T   ,  func3: I3 => T   ,  func4: I4 => T   ,  func5: I5 => T   ,  func6: I6 => T   ,  func7: I7 => T   ,  func8: I8 => T   ,  func9: I9 => T   ,  func10: I10 => T   ,  func11: I11 => T   ,  func12: I12 => T   ,  func13: I13 => T   ,  func14: I14 => T   ,  func15: I15 => T   ,  func16: I16 => T  ): T = {
                var getValue: Any = null
                adtList.method1(  new FoldListPositive(  new FoldListPositive(  new FoldListPositive(  new FoldListPositive(  new FoldListPositive(  new FoldListPositive(  new FoldListPositive(  new FoldListPositive(  new FoldListPositive(  new FoldListPositive(  new FoldListPositive(  new FoldListPositive(  new FoldListPositive(  new FoldListPositive(  new FoldListPositive(  new FoldListPositive(  FoldList.zero ) with TypeAdtGetter {
    override def runGetter: Unit = getValue = func16.asInstanceOf[Any => Any](data)
} ) with TypeAdtGetter {
    override def runGetter: Unit = getValue = func15.asInstanceOf[Any => Any](data)
} ) with TypeAdtGetter {
    override def runGetter: Unit = getValue = func14.asInstanceOf[Any => Any](data)
} ) with TypeAdtGetter {
    override def runGetter: Unit = getValue = func13.asInstanceOf[Any => Any](data)
} ) with TypeAdtGetter {
    override def runGetter: Unit = getValue = func12.asInstanceOf[Any => Any](data)
} ) with TypeAdtGetter {
    override def runGetter: Unit = getValue = func11.asInstanceOf[Any => Any](data)
} ) with TypeAdtGetter {
    override def runGetter: Unit = getValue = func10.asInstanceOf[Any => Any](data)
} ) with TypeAdtGetter {
    override def runGetter: Unit = getValue = func9.asInstanceOf[Any => Any](data)
} ) with TypeAdtGetter {
    override def runGetter: Unit = getValue = func8.asInstanceOf[Any => Any](data)
} ) with TypeAdtGetter {
    override def runGetter: Unit = getValue = func7.asInstanceOf[Any => Any](data)
} ) with TypeAdtGetter {
    override def runGetter: Unit = getValue = func6.asInstanceOf[Any => Any](data)
} ) with TypeAdtGetter {
    override def runGetter: Unit = getValue = func5.asInstanceOf[Any => Any](data)
} ) with TypeAdtGetter {
    override def runGetter: Unit = getValue = func4.asInstanceOf[Any => Any](data)
} ) with TypeAdtGetter {
    override def runGetter: Unit = getValue = func3.asInstanceOf[Any => Any](data)
} ) with TypeAdtGetter {
    override def runGetter: Unit = getValue = func2.asInstanceOf[Any => Any](data)
} ) with TypeAdtGetter {
    override def runGetter: Unit = getValue = func1.asInstanceOf[Any => Any](data)
} )
                getValue.asInstanceOf[T]
            }
        }
        object HelperIOImpl16 extends HelperIO[Any] {
            override type Out = CusInnerApply16[   Any   ,  Any   ,  Any   ,  Any   ,  Any   ,  Any   ,  Any   ,  Any   ,  Any   ,  Any   ,  Any   ,  Any   ,  Any   ,  Any   ,  Any   ,  Any  ]
            @inline override def helper(adtList: AdtList, data: Any): CusInnerApply16[   Any   ,  Any   ,  Any   ,  Any   ,  Any   ,  Any   ,  Any   ,  Any   ,  Any   ,  Any   ,  Any   ,  Any   ,  Any   ,  Any   ,  Any   ,  Any  ] = new CusInnerApply16(adtList, data)
        }
    
        class CusInnerApply17[   I1   ,  I2   ,  I3   ,  I4   ,  I5   ,  I6   ,  I7   ,  I8   ,  I9   ,  I10   ,  I11   ,  I12   ,  I13   ,  I14   ,  I15   ,  I16   ,  I17  ](adtList: AdtList, data: Any) {
            @inline def fold[T](   func1: I1 => T   ,  func2: I2 => T   ,  func3: I3 => T   ,  func4: I4 => T   ,  func5: I5 => T   ,  func6: I6 => T   ,  func7: I7 => T   ,  func8: I8 => T   ,  func9: I9 => T   ,  func10: I10 => T   ,  func11: I11 => T   ,  func12: I12 => T   ,  func13: I13 => T   ,  func14: I14 => T   ,  func15: I15 => T   ,  func16: I16 => T   ,  func17: I17 => T  ): T = {
                var getValue: Any = null
                adtList.method1(  new FoldListPositive(  new FoldListPositive(  new FoldListPositive(  new FoldListPositive(  new FoldListPositive(  new FoldListPositive(  new FoldListPositive(  new FoldListPositive(  new FoldListPositive(  new FoldListPositive(  new FoldListPositive(  new FoldListPositive(  new FoldListPositive(  new FoldListPositive(  new FoldListPositive(  new FoldListPositive(  new FoldListPositive(  FoldList.zero ) with TypeAdtGetter {
    override def runGetter: Unit = getValue = func17.asInstanceOf[Any => Any](data)
} ) with TypeAdtGetter {
    override def runGetter: Unit = getValue = func16.asInstanceOf[Any => Any](data)
} ) with TypeAdtGetter {
    override def runGetter: Unit = getValue = func15.asInstanceOf[Any => Any](data)
} ) with TypeAdtGetter {
    override def runGetter: Unit = getValue = func14.asInstanceOf[Any => Any](data)
} ) with TypeAdtGetter {
    override def runGetter: Unit = getValue = func13.asInstanceOf[Any => Any](data)
} ) with TypeAdtGetter {
    override def runGetter: Unit = getValue = func12.asInstanceOf[Any => Any](data)
} ) with TypeAdtGetter {
    override def runGetter: Unit = getValue = func11.asInstanceOf[Any => Any](data)
} ) with TypeAdtGetter {
    override def runGetter: Unit = getValue = func10.asInstanceOf[Any => Any](data)
} ) with TypeAdtGetter {
    override def runGetter: Unit = getValue = func9.asInstanceOf[Any => Any](data)
} ) with TypeAdtGetter {
    override def runGetter: Unit = getValue = func8.asInstanceOf[Any => Any](data)
} ) with TypeAdtGetter {
    override def runGetter: Unit = getValue = func7.asInstanceOf[Any => Any](data)
} ) with TypeAdtGetter {
    override def runGetter: Unit = getValue = func6.asInstanceOf[Any => Any](data)
} ) with TypeAdtGetter {
    override def runGetter: Unit = getValue = func5.asInstanceOf[Any => Any](data)
} ) with TypeAdtGetter {
    override def runGetter: Unit = getValue = func4.asInstanceOf[Any => Any](data)
} ) with TypeAdtGetter {
    override def runGetter: Unit = getValue = func3.asInstanceOf[Any => Any](data)
} ) with TypeAdtGetter {
    override def runGetter: Unit = getValue = func2.asInstanceOf[Any => Any](data)
} ) with TypeAdtGetter {
    override def runGetter: Unit = getValue = func1.asInstanceOf[Any => Any](data)
} )
                getValue.asInstanceOf[T]
            }
        }
        object HelperIOImpl17 extends HelperIO[Any] {
            override type Out = CusInnerApply17[   Any   ,  Any   ,  Any   ,  Any   ,  Any   ,  Any   ,  Any   ,  Any   ,  Any   ,  Any   ,  Any   ,  Any   ,  Any   ,  Any   ,  Any   ,  Any   ,  Any  ]
            @inline override def helper(adtList: AdtList, data: Any): CusInnerApply17[   Any   ,  Any   ,  Any   ,  Any   ,  Any   ,  Any   ,  Any   ,  Any   ,  Any   ,  Any   ,  Any   ,  Any   ,  Any   ,  Any   ,  Any   ,  Any   ,  Any  ] = new CusInnerApply17(adtList, data)
        }
    
        class CusInnerApply18[   I1   ,  I2   ,  I3   ,  I4   ,  I5   ,  I6   ,  I7   ,  I8   ,  I9   ,  I10   ,  I11   ,  I12   ,  I13   ,  I14   ,  I15   ,  I16   ,  I17   ,  I18  ](adtList: AdtList, data: Any) {
            @inline def fold[T](   func1: I1 => T   ,  func2: I2 => T   ,  func3: I3 => T   ,  func4: I4 => T   ,  func5: I5 => T   ,  func6: I6 => T   ,  func7: I7 => T   ,  func8: I8 => T   ,  func9: I9 => T   ,  func10: I10 => T   ,  func11: I11 => T   ,  func12: I12 => T   ,  func13: I13 => T   ,  func14: I14 => T   ,  func15: I15 => T   ,  func16: I16 => T   ,  func17: I17 => T   ,  func18: I18 => T  ): T = {
                var getValue: Any = null
                adtList.method1(  new FoldListPositive(  new FoldListPositive(  new FoldListPositive(  new FoldListPositive(  new FoldListPositive(  new FoldListPositive(  new FoldListPositive(  new FoldListPositive(  new FoldListPositive(  new FoldListPositive(  new FoldListPositive(  new FoldListPositive(  new FoldListPositive(  new FoldListPositive(  new FoldListPositive(  new FoldListPositive(  new FoldListPositive(  new FoldListPositive(  FoldList.zero ) with TypeAdtGetter {
    override def runGetter: Unit = getValue = func18.asInstanceOf[Any => Any](data)
} ) with TypeAdtGetter {
    override def runGetter: Unit = getValue = func17.asInstanceOf[Any => Any](data)
} ) with TypeAdtGetter {
    override def runGetter: Unit = getValue = func16.asInstanceOf[Any => Any](data)
} ) with TypeAdtGetter {
    override def runGetter: Unit = getValue = func15.asInstanceOf[Any => Any](data)
} ) with TypeAdtGetter {
    override def runGetter: Unit = getValue = func14.asInstanceOf[Any => Any](data)
} ) with TypeAdtGetter {
    override def runGetter: Unit = getValue = func13.asInstanceOf[Any => Any](data)
} ) with TypeAdtGetter {
    override def runGetter: Unit = getValue = func12.asInstanceOf[Any => Any](data)
} ) with TypeAdtGetter {
    override def runGetter: Unit = getValue = func11.asInstanceOf[Any => Any](data)
} ) with TypeAdtGetter {
    override def runGetter: Unit = getValue = func10.asInstanceOf[Any => Any](data)
} ) with TypeAdtGetter {
    override def runGetter: Unit = getValue = func9.asInstanceOf[Any => Any](data)
} ) with TypeAdtGetter {
    override def runGetter: Unit = getValue = func8.asInstanceOf[Any => Any](data)
} ) with TypeAdtGetter {
    override def runGetter: Unit = getValue = func7.asInstanceOf[Any => Any](data)
} ) with TypeAdtGetter {
    override def runGetter: Unit = getValue = func6.asInstanceOf[Any => Any](data)
} ) with TypeAdtGetter {
    override def runGetter: Unit = getValue = func5.asInstanceOf[Any => Any](data)
} ) with TypeAdtGetter {
    override def runGetter: Unit = getValue = func4.asInstanceOf[Any => Any](data)
} ) with TypeAdtGetter {
    override def runGetter: Unit = getValue = func3.asInstanceOf[Any => Any](data)
} ) with TypeAdtGetter {
    override def runGetter: Unit = getValue = func2.asInstanceOf[Any => Any](data)
} ) with TypeAdtGetter {
    override def runGetter: Unit = getValue = func1.asInstanceOf[Any => Any](data)
} )
                getValue.asInstanceOf[T]
            }
        }
        object HelperIOImpl18 extends HelperIO[Any] {
            override type Out = CusInnerApply18[   Any   ,  Any   ,  Any   ,  Any   ,  Any   ,  Any   ,  Any   ,  Any   ,  Any   ,  Any   ,  Any   ,  Any   ,  Any   ,  Any   ,  Any   ,  Any   ,  Any   ,  Any  ]
            @inline override def helper(adtList: AdtList, data: Any): CusInnerApply18[   Any   ,  Any   ,  Any   ,  Any   ,  Any   ,  Any   ,  Any   ,  Any   ,  Any   ,  Any   ,  Any   ,  Any   ,  Any   ,  Any   ,  Any   ,  Any   ,  Any   ,  Any  ] = new CusInnerApply18(adtList, data)
        }
    
        class CusInnerApply19[   I1   ,  I2   ,  I3   ,  I4   ,  I5   ,  I6   ,  I7   ,  I8   ,  I9   ,  I10   ,  I11   ,  I12   ,  I13   ,  I14   ,  I15   ,  I16   ,  I17   ,  I18   ,  I19  ](adtList: AdtList, data: Any) {
            @inline def fold[T](   func1: I1 => T   ,  func2: I2 => T   ,  func3: I3 => T   ,  func4: I4 => T   ,  func5: I5 => T   ,  func6: I6 => T   ,  func7: I7 => T   ,  func8: I8 => T   ,  func9: I9 => T   ,  func10: I10 => T   ,  func11: I11 => T   ,  func12: I12 => T   ,  func13: I13 => T   ,  func14: I14 => T   ,  func15: I15 => T   ,  func16: I16 => T   ,  func17: I17 => T   ,  func18: I18 => T   ,  func19: I19 => T  ): T = {
                var getValue: Any = null
                adtList.method1(  new FoldListPositive(  new FoldListPositive(  new FoldListPositive(  new FoldListPositive(  new FoldListPositive(  new FoldListPositive(  new FoldListPositive(  new FoldListPositive(  new FoldListPositive(  new FoldListPositive(  new FoldListPositive(  new FoldListPositive(  new FoldListPositive(  new FoldListPositive(  new FoldListPositive(  new FoldListPositive(  new FoldListPositive(  new FoldListPositive(  new FoldListPositive(  FoldList.zero ) with TypeAdtGetter {
    override def runGetter: Unit = getValue = func19.asInstanceOf[Any => Any](data)
} ) with TypeAdtGetter {
    override def runGetter: Unit = getValue = func18.asInstanceOf[Any => Any](data)
} ) with TypeAdtGetter {
    override def runGetter: Unit = getValue = func17.asInstanceOf[Any => Any](data)
} ) with TypeAdtGetter {
    override def runGetter: Unit = getValue = func16.asInstanceOf[Any => Any](data)
} ) with TypeAdtGetter {
    override def runGetter: Unit = getValue = func15.asInstanceOf[Any => Any](data)
} ) with TypeAdtGetter {
    override def runGetter: Unit = getValue = func14.asInstanceOf[Any => Any](data)
} ) with TypeAdtGetter {
    override def runGetter: Unit = getValue = func13.asInstanceOf[Any => Any](data)
} ) with TypeAdtGetter {
    override def runGetter: Unit = getValue = func12.asInstanceOf[Any => Any](data)
} ) with TypeAdtGetter {
    override def runGetter: Unit = getValue = func11.asInstanceOf[Any => Any](data)
} ) with TypeAdtGetter {
    override def runGetter: Unit = getValue = func10.asInstanceOf[Any => Any](data)
} ) with TypeAdtGetter {
    override def runGetter: Unit = getValue = func9.asInstanceOf[Any => Any](data)
} ) with TypeAdtGetter {
    override def runGetter: Unit = getValue = func8.asInstanceOf[Any => Any](data)
} ) with TypeAdtGetter {
    override def runGetter: Unit = getValue = func7.asInstanceOf[Any => Any](data)
} ) with TypeAdtGetter {
    override def runGetter: Unit = getValue = func6.asInstanceOf[Any => Any](data)
} ) with TypeAdtGetter {
    override def runGetter: Unit = getValue = func5.asInstanceOf[Any => Any](data)
} ) with TypeAdtGetter {
    override def runGetter: Unit = getValue = func4.asInstanceOf[Any => Any](data)
} ) with TypeAdtGetter {
    override def runGetter: Unit = getValue = func3.asInstanceOf[Any => Any](data)
} ) with TypeAdtGetter {
    override def runGetter: Unit = getValue = func2.asInstanceOf[Any => Any](data)
} ) with TypeAdtGetter {
    override def runGetter: Unit = getValue = func1.asInstanceOf[Any => Any](data)
} )
                getValue.asInstanceOf[T]
            }
        }
        object HelperIOImpl19 extends HelperIO[Any] {
            override type Out = CusInnerApply19[   Any   ,  Any   ,  Any   ,  Any   ,  Any   ,  Any   ,  Any   ,  Any   ,  Any   ,  Any   ,  Any   ,  Any   ,  Any   ,  Any   ,  Any   ,  Any   ,  Any   ,  Any   ,  Any  ]
            @inline override def helper(adtList: AdtList, data: Any): CusInnerApply19[   Any   ,  Any   ,  Any   ,  Any   ,  Any   ,  Any   ,  Any   ,  Any   ,  Any   ,  Any   ,  Any   ,  Any   ,  Any   ,  Any   ,  Any   ,  Any   ,  Any   ,  Any   ,  Any  ] = new CusInnerApply19(adtList, data)
        }
    
        class CusInnerApply20[   I1   ,  I2   ,  I3   ,  I4   ,  I5   ,  I6   ,  I7   ,  I8   ,  I9   ,  I10   ,  I11   ,  I12   ,  I13   ,  I14   ,  I15   ,  I16   ,  I17   ,  I18   ,  I19   ,  I20  ](adtList: AdtList, data: Any) {
            @inline def fold[T](   func1: I1 => T   ,  func2: I2 => T   ,  func3: I3 => T   ,  func4: I4 => T   ,  func5: I5 => T   ,  func6: I6 => T   ,  func7: I7 => T   ,  func8: I8 => T   ,  func9: I9 => T   ,  func10: I10 => T   ,  func11: I11 => T   ,  func12: I12 => T   ,  func13: I13 => T   ,  func14: I14 => T   ,  func15: I15 => T   ,  func16: I16 => T   ,  func17: I17 => T   ,  func18: I18 => T   ,  func19: I19 => T   ,  func20: I20 => T  ): T = {
                var getValue: Any = null
                adtList.method1(  new FoldListPositive(  new FoldListPositive(  new FoldListPositive(  new FoldListPositive(  new FoldListPositive(  new FoldListPositive(  new FoldListPositive(  new FoldListPositive(  new FoldListPositive(  new FoldListPositive(  new FoldListPositive(  new FoldListPositive(  new FoldListPositive(  new FoldListPositive(  new FoldListPositive(  new FoldListPositive(  new FoldListPositive(  new FoldListPositive(  new FoldListPositive(  new FoldListPositive(  FoldList.zero ) with TypeAdtGetter {
    override def runGetter: Unit = getValue = func20.asInstanceOf[Any => Any](data)
} ) with TypeAdtGetter {
    override def runGetter: Unit = getValue = func19.asInstanceOf[Any => Any](data)
} ) with TypeAdtGetter {
    override def runGetter: Unit = getValue = func18.asInstanceOf[Any => Any](data)
} ) with TypeAdtGetter {
    override def runGetter: Unit = getValue = func17.asInstanceOf[Any => Any](data)
} ) with TypeAdtGetter {
    override def runGetter: Unit = getValue = func16.asInstanceOf[Any => Any](data)
} ) with TypeAdtGetter {
    override def runGetter: Unit = getValue = func15.asInstanceOf[Any => Any](data)
} ) with TypeAdtGetter {
    override def runGetter: Unit = getValue = func14.asInstanceOf[Any => Any](data)
} ) with TypeAdtGetter {
    override def runGetter: Unit = getValue = func13.asInstanceOf[Any => Any](data)
} ) with TypeAdtGetter {
    override def runGetter: Unit = getValue = func12.asInstanceOf[Any => Any](data)
} ) with TypeAdtGetter {
    override def runGetter: Unit = getValue = func11.asInstanceOf[Any => Any](data)
} ) with TypeAdtGetter {
    override def runGetter: Unit = getValue = func10.asInstanceOf[Any => Any](data)
} ) with TypeAdtGetter {
    override def runGetter: Unit = getValue = func9.asInstanceOf[Any => Any](data)
} ) with TypeAdtGetter {
    override def runGetter: Unit = getValue = func8.asInstanceOf[Any => Any](data)
} ) with TypeAdtGetter {
    override def runGetter: Unit = getValue = func7.asInstanceOf[Any => Any](data)
} ) with TypeAdtGetter {
    override def runGetter: Unit = getValue = func6.asInstanceOf[Any => Any](data)
} ) with TypeAdtGetter {
    override def runGetter: Unit = getValue = func5.asInstanceOf[Any => Any](data)
} ) with TypeAdtGetter {
    override def runGetter: Unit = getValue = func4.asInstanceOf[Any => Any](data)
} ) with TypeAdtGetter {
    override def runGetter: Unit = getValue = func3.asInstanceOf[Any => Any](data)
} ) with TypeAdtGetter {
    override def runGetter: Unit = getValue = func2.asInstanceOf[Any => Any](data)
} ) with TypeAdtGetter {
    override def runGetter: Unit = getValue = func1.asInstanceOf[Any => Any](data)
} )
                getValue.asInstanceOf[T]
            }
        }
        object HelperIOImpl20 extends HelperIO[Any] {
            override type Out = CusInnerApply20[   Any   ,  Any   ,  Any   ,  Any   ,  Any   ,  Any   ,  Any   ,  Any   ,  Any   ,  Any   ,  Any   ,  Any   ,  Any   ,  Any   ,  Any   ,  Any   ,  Any   ,  Any   ,  Any   ,  Any  ]
            @inline override def helper(adtList: AdtList, data: Any): CusInnerApply20[   Any   ,  Any   ,  Any   ,  Any   ,  Any   ,  Any   ,  Any   ,  Any   ,  Any   ,  Any   ,  Any   ,  Any   ,  Any   ,  Any   ,  Any   ,  Any   ,  Any   ,  Any   ,  Any   ,  Any  ] = new CusInnerApply20(adtList, data)
        }
    
        class CusInnerApply21[   I1   ,  I2   ,  I3   ,  I4   ,  I5   ,  I6   ,  I7   ,  I8   ,  I9   ,  I10   ,  I11   ,  I12   ,  I13   ,  I14   ,  I15   ,  I16   ,  I17   ,  I18   ,  I19   ,  I20   ,  I21  ](adtList: AdtList, data: Any) {
            @inline def fold[T](   func1: I1 => T   ,  func2: I2 => T   ,  func3: I3 => T   ,  func4: I4 => T   ,  func5: I5 => T   ,  func6: I6 => T   ,  func7: I7 => T   ,  func8: I8 => T   ,  func9: I9 => T   ,  func10: I10 => T   ,  func11: I11 => T   ,  func12: I12 => T   ,  func13: I13 => T   ,  func14: I14 => T   ,  func15: I15 => T   ,  func16: I16 => T   ,  func17: I17 => T   ,  func18: I18 => T   ,  func19: I19 => T   ,  func20: I20 => T   ,  func21: I21 => T  ): T = {
                var getValue: Any = null
                adtList.method1(  new FoldListPositive(  new FoldListPositive(  new FoldListPositive(  new FoldListPositive(  new FoldListPositive(  new FoldListPositive(  new FoldListPositive(  new FoldListPositive(  new FoldListPositive(  new FoldListPositive(  new FoldListPositive(  new FoldListPositive(  new FoldListPositive(  new FoldListPositive(  new FoldListPositive(  new FoldListPositive(  new FoldListPositive(  new FoldListPositive(  new FoldListPositive(  new FoldListPositive(  new FoldListPositive(  FoldList.zero ) with TypeAdtGetter {
    override def runGetter: Unit = getValue = func21.asInstanceOf[Any => Any](data)
} ) with TypeAdtGetter {
    override def runGetter: Unit = getValue = func20.asInstanceOf[Any => Any](data)
} ) with TypeAdtGetter {
    override def runGetter: Unit = getValue = func19.asInstanceOf[Any => Any](data)
} ) with TypeAdtGetter {
    override def runGetter: Unit = getValue = func18.asInstanceOf[Any => Any](data)
} ) with TypeAdtGetter {
    override def runGetter: Unit = getValue = func17.asInstanceOf[Any => Any](data)
} ) with TypeAdtGetter {
    override def runGetter: Unit = getValue = func16.asInstanceOf[Any => Any](data)
} ) with TypeAdtGetter {
    override def runGetter: Unit = getValue = func15.asInstanceOf[Any => Any](data)
} ) with TypeAdtGetter {
    override def runGetter: Unit = getValue = func14.asInstanceOf[Any => Any](data)
} ) with TypeAdtGetter {
    override def runGetter: Unit = getValue = func13.asInstanceOf[Any => Any](data)
} ) with TypeAdtGetter {
    override def runGetter: Unit = getValue = func12.asInstanceOf[Any => Any](data)
} ) with TypeAdtGetter {
    override def runGetter: Unit = getValue = func11.asInstanceOf[Any => Any](data)
} ) with TypeAdtGetter {
    override def runGetter: Unit = getValue = func10.asInstanceOf[Any => Any](data)
} ) with TypeAdtGetter {
    override def runGetter: Unit = getValue = func9.asInstanceOf[Any => Any](data)
} ) with TypeAdtGetter {
    override def runGetter: Unit = getValue = func8.asInstanceOf[Any => Any](data)
} ) with TypeAdtGetter {
    override def runGetter: Unit = getValue = func7.asInstanceOf[Any => Any](data)
} ) with TypeAdtGetter {
    override def runGetter: Unit = getValue = func6.asInstanceOf[Any => Any](data)
} ) with TypeAdtGetter {
    override def runGetter: Unit = getValue = func5.asInstanceOf[Any => Any](data)
} ) with TypeAdtGetter {
    override def runGetter: Unit = getValue = func4.asInstanceOf[Any => Any](data)
} ) with TypeAdtGetter {
    override def runGetter: Unit = getValue = func3.asInstanceOf[Any => Any](data)
} ) with TypeAdtGetter {
    override def runGetter: Unit = getValue = func2.asInstanceOf[Any => Any](data)
} ) with TypeAdtGetter {
    override def runGetter: Unit = getValue = func1.asInstanceOf[Any => Any](data)
} )
                getValue.asInstanceOf[T]
            }
        }
        object HelperIOImpl21 extends HelperIO[Any] {
            override type Out = CusInnerApply21[   Any   ,  Any   ,  Any   ,  Any   ,  Any   ,  Any   ,  Any   ,  Any   ,  Any   ,  Any   ,  Any   ,  Any   ,  Any   ,  Any   ,  Any   ,  Any   ,  Any   ,  Any   ,  Any   ,  Any   ,  Any  ]
            @inline override def helper(adtList: AdtList, data: Any): CusInnerApply21[   Any   ,  Any   ,  Any   ,  Any   ,  Any   ,  Any   ,  Any   ,  Any   ,  Any   ,  Any   ,  Any   ,  Any   ,  Any   ,  Any   ,  Any   ,  Any   ,  Any   ,  Any   ,  Any   ,  Any   ,  Any  ] = new CusInnerApply21(adtList, data)
        }
    
        class CusInnerApply22[   I1   ,  I2   ,  I3   ,  I4   ,  I5   ,  I6   ,  I7   ,  I8   ,  I9   ,  I10   ,  I11   ,  I12   ,  I13   ,  I14   ,  I15   ,  I16   ,  I17   ,  I18   ,  I19   ,  I20   ,  I21   ,  I22  ](adtList: AdtList, data: Any) {
            @inline def fold[T](   func1: I1 => T   ,  func2: I2 => T   ,  func3: I3 => T   ,  func4: I4 => T   ,  func5: I5 => T   ,  func6: I6 => T   ,  func7: I7 => T   ,  func8: I8 => T   ,  func9: I9 => T   ,  func10: I10 => T   ,  func11: I11 => T   ,  func12: I12 => T   ,  func13: I13 => T   ,  func14: I14 => T   ,  func15: I15 => T   ,  func16: I16 => T   ,  func17: I17 => T   ,  func18: I18 => T   ,  func19: I19 => T   ,  func20: I20 => T   ,  func21: I21 => T   ,  func22: I22 => T  ): T = {
                var getValue: Any = null
                adtList.method1(  new FoldListPositive(  new FoldListPositive(  new FoldListPositive(  new FoldListPositive(  new FoldListPositive(  new FoldListPositive(  new FoldListPositive(  new FoldListPositive(  new FoldListPositive(  new FoldListPositive(  new FoldListPositive(  new FoldListPositive(  new FoldListPositive(  new FoldListPositive(  new FoldListPositive(  new FoldListPositive(  new FoldListPositive(  new FoldListPositive(  new FoldListPositive(  new FoldListPositive(  new FoldListPositive(  new FoldListPositive(  FoldList.zero ) with TypeAdtGetter {
    override def runGetter: Unit = getValue = func22.asInstanceOf[Any => Any](data)
} ) with TypeAdtGetter {
    override def runGetter: Unit = getValue = func21.asInstanceOf[Any => Any](data)
} ) with TypeAdtGetter {
    override def runGetter: Unit = getValue = func20.asInstanceOf[Any => Any](data)
} ) with TypeAdtGetter {
    override def runGetter: Unit = getValue = func19.asInstanceOf[Any => Any](data)
} ) with TypeAdtGetter {
    override def runGetter: Unit = getValue = func18.asInstanceOf[Any => Any](data)
} ) with TypeAdtGetter {
    override def runGetter: Unit = getValue = func17.asInstanceOf[Any => Any](data)
} ) with TypeAdtGetter {
    override def runGetter: Unit = getValue = func16.asInstanceOf[Any => Any](data)
} ) with TypeAdtGetter {
    override def runGetter: Unit = getValue = func15.asInstanceOf[Any => Any](data)
} ) with TypeAdtGetter {
    override def runGetter: Unit = getValue = func14.asInstanceOf[Any => Any](data)
} ) with TypeAdtGetter {
    override def runGetter: Unit = getValue = func13.asInstanceOf[Any => Any](data)
} ) with TypeAdtGetter {
    override def runGetter: Unit = getValue = func12.asInstanceOf[Any => Any](data)
} ) with TypeAdtGetter {
    override def runGetter: Unit = getValue = func11.asInstanceOf[Any => Any](data)
} ) with TypeAdtGetter {
    override def runGetter: Unit = getValue = func10.asInstanceOf[Any => Any](data)
} ) with TypeAdtGetter {
    override def runGetter: Unit = getValue = func9.asInstanceOf[Any => Any](data)
} ) with TypeAdtGetter {
    override def runGetter: Unit = getValue = func8.asInstanceOf[Any => Any](data)
} ) with TypeAdtGetter {
    override def runGetter: Unit = getValue = func7.asInstanceOf[Any => Any](data)
} ) with TypeAdtGetter {
    override def runGetter: Unit = getValue = func6.asInstanceOf[Any => Any](data)
} ) with TypeAdtGetter {
    override def runGetter: Unit = getValue = func5.asInstanceOf[Any => Any](data)
} ) with TypeAdtGetter {
    override def runGetter: Unit = getValue = func4.asInstanceOf[Any => Any](data)
} ) with TypeAdtGetter {
    override def runGetter: Unit = getValue = func3.asInstanceOf[Any => Any](data)
} ) with TypeAdtGetter {
    override def runGetter: Unit = getValue = func2.asInstanceOf[Any => Any](data)
} ) with TypeAdtGetter {
    override def runGetter: Unit = getValue = func1.asInstanceOf[Any => Any](data)
} )
                getValue.asInstanceOf[T]
            }
        }
        object HelperIOImpl22 extends HelperIO[Any] {
            override type Out = CusInnerApply22[   Any   ,  Any   ,  Any   ,  Any   ,  Any   ,  Any   ,  Any   ,  Any   ,  Any   ,  Any   ,  Any   ,  Any   ,  Any   ,  Any   ,  Any   ,  Any   ,  Any   ,  Any   ,  Any   ,  Any   ,  Any   ,  Any  ]
            @inline override def helper(adtList: AdtList, data: Any): CusInnerApply22[   Any   ,  Any   ,  Any   ,  Any   ,  Any   ,  Any   ,  Any   ,  Any   ,  Any   ,  Any   ,  Any   ,  Any   ,  Any   ,  Any   ,  Any   ,  Any   ,  Any   ,  Any   ,  Any   ,  Any   ,  Any   ,  Any  ] = new CusInnerApply22(adtList, data)
        }
    
}
