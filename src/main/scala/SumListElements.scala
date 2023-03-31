package com.knoldus

import scala.annotation.tailrec

object SumListElements extends App {

  private def sumList(list: List[Int]): Int = {

    @tailrec
    def sumListHelper(inputList: List[Int], accumulator: Int = 0): Int = {

      inputList.headOption match {
        case Some(head) => sumListHelper(inputList.tail, accumulator + head)
        case None => accumulator
      }
    }

    sumListHelper(list)
  }

  private val inputList = List()
  println(sumList(inputList))
}
