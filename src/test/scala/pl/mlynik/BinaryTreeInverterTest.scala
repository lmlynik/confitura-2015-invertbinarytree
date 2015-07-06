package pl.mlynik

import org.scalatest.{Matchers, FunSuite}
import org.scalatest.prop.TableDrivenPropertyChecks


class BinaryTreeInverterTest extends FunSuite with TableDrivenPropertyChecks with Matchers {
  private implicit def tr2TrOpt(tr: TreeNode): Option[TreeNode] = Some(tr)

  val tree = TreeNode(1,
    TreeNode(2,
      TreeNode(4),
      TreeNode(5)),
    TreeNode(3,
      TreeNode(6),
      TreeNode(7)))

  val invertedTree = BinaryTreeInverter(tree)

  test("Furthest right node should be 4") {
    val rightBranch = invertedTree.right.flatMap(_.right)

    rightBranch.map(_.value) should equal(Some(4))
  }

  test("Furthest left node should be 7") {
    val leftBranch = invertedTree.left.flatMap(_.left)

    leftBranch.map(_.value) should equal(Some(7))
  }
}
