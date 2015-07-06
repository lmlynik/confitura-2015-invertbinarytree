package pl.mlynik


object BinaryTreeInverter {
  def apply(tree: TreeNode): TreeNode = {
    val left = tree.left.map(apply)
    val right = tree.right.map(apply)

    TreeNode(tree.value, left = right, right = left)
  }
}
