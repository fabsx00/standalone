package io.shiftleft.codepropertygraph.generated

import io.shiftleft.codepropertygraph.generated.nodes
import io.shiftleft.codepropertygraph.generated.edges
import flatgraph.FormalQtyType

object GraphSchema extends flatgraph.Schema {
  private val nodeLabels = IndexedSeq(
    "ANNOTATION",
    "ANNOTATION_LITERAL",
    "ANNOTATION_PARAMETER",
    "ANNOTATION_PARAMETER_ASSIGN",
    "ARRAY_INITIALIZER",
    "BINDING",
    "BLOCK",
    "CALL",
    "CLOSURE_BINDING",
    "COMMENT",
    "CONFIG_FILE",
    "CONTROL_STRUCTURE",
    "DEPENDENCY",
    "FIELD_IDENTIFIER",
    "FILE",
    "FINDING",
    "IDENTIFIER",
    "IMPORT",
    "JUMP_LABEL",
    "JUMP_TARGET",
    "KEY_VALUE_PAIR",
    "LITERAL",
    "LOCAL",
    "LOCATION",
    "MEMBER",
    "META_DATA",
    "METHOD",
    "METHOD_PARAMETER_IN",
    "METHOD_PARAMETER_OUT",
    "METHOD_REF",
    "METHOD_RETURN",
    "MODIFIER",
    "MYNODETYPE",
    "NAMESPACE",
    "NAMESPACE_BLOCK",
    "RETURN",
    "TAG",
    "TAG_NODE_PAIR",
    "TEMPLATE_DOM",
    "TYPE",
    "TYPE_ARGUMENT",
    "TYPE_DECL",
    "TYPE_PARAMETER",
    "TYPE_REF",
    "UNKNOWN"
  )
  val nodeKindByLabel = nodeLabels.zipWithIndex.toMap
  val edgeLabels = Array(
    "ALIAS_OF",
    "ARGUMENT",
    "AST",
    "BINDS",
    "BINDS_TO",
    "CALL",
    "CAPTURE",
    "CAPTURED_BY",
    "CDG",
    "CFG",
    "CONDITION",
    "CONTAINS",
    "DOMINATE",
    "EVAL_TYPE",
    "IMPORTS",
    "INHERITS_FROM",
    "IS_CALL_FOR_IMPORT",
    "PARAMETER_LINK",
    "POST_DOMINATE",
    "REACHING_DEF",
    "RECEIVER",
    "REF",
    "SOURCE_FILE",
    "TAGGED_BY"
  )
  val edgeKindByLabel = edgeLabels.zipWithIndex.toMap
  val edgePropertyAllocators: Array[Int => Array[?]] = Array(
    size => null,
    size => null,
    size => null,
    size => null,
    size => null,
    size => null,
    size => null,
    size => null,
    size => null,
    size => null,
    size => null,
    size => null,
    size => null,
    size => null,
    size => null,
    size => null,
    size => null,
    size => null,
    size => null,
    size => Array.fill(size)("<empty>") /* label = REACHING_DEF, id = 19 */,
    size => null,
    size => null,
    size => null,
    size => null
  )
  val nodeFactories: Array[(flatgraph.Graph, Int) => nodes.StoredNode] = Array(
    (g, seq) => new nodes.Annotation(g, seq),
    (g, seq) => new nodes.AnnotationLiteral(g, seq),
    (g, seq) => new nodes.AnnotationParameter(g, seq),
    (g, seq) => new nodes.AnnotationParameterAssign(g, seq),
    (g, seq) => new nodes.ArrayInitializer(g, seq),
    (g, seq) => new nodes.Binding(g, seq),
    (g, seq) => new nodes.Block(g, seq),
    (g, seq) => new nodes.Call(g, seq),
    (g, seq) => new nodes.ClosureBinding(g, seq),
    (g, seq) => new nodes.Comment(g, seq),
    (g, seq) => new nodes.ConfigFile(g, seq),
    (g, seq) => new nodes.ControlStructure(g, seq),
    (g, seq) => new nodes.Dependency(g, seq),
    (g, seq) => new nodes.FieldIdentifier(g, seq),
    (g, seq) => new nodes.File(g, seq),
    (g, seq) => new nodes.Finding(g, seq),
    (g, seq) => new nodes.Identifier(g, seq),
    (g, seq) => new nodes.Import(g, seq),
    (g, seq) => new nodes.JumpLabel(g, seq),
    (g, seq) => new nodes.JumpTarget(g, seq),
    (g, seq) => new nodes.KeyValuePair(g, seq),
    (g, seq) => new nodes.Literal(g, seq),
    (g, seq) => new nodes.Local(g, seq),
    (g, seq) => new nodes.Location(g, seq),
    (g, seq) => new nodes.Member(g, seq),
    (g, seq) => new nodes.MetaData(g, seq),
    (g, seq) => new nodes.Method(g, seq),
    (g, seq) => new nodes.MethodParameterIn(g, seq),
    (g, seq) => new nodes.MethodParameterOut(g, seq),
    (g, seq) => new nodes.MethodRef(g, seq),
    (g, seq) => new nodes.MethodReturn(g, seq),
    (g, seq) => new nodes.Modifier(g, seq),
    (g, seq) => new nodes.Mynodetype(g, seq),
    (g, seq) => new nodes.Namespace(g, seq),
    (g, seq) => new nodes.NamespaceBlock(g, seq),
    (g, seq) => new nodes.Return(g, seq),
    (g, seq) => new nodes.Tag(g, seq),
    (g, seq) => new nodes.TagNodePair(g, seq),
    (g, seq) => new nodes.TemplateDom(g, seq),
    (g, seq) => new nodes.Type(g, seq),
    (g, seq) => new nodes.TypeArgument(g, seq),
    (g, seq) => new nodes.TypeDecl(g, seq),
    (g, seq) => new nodes.TypeParameter(g, seq),
    (g, seq) => new nodes.TypeRef(g, seq),
    (g, seq) => new nodes.Unknown(g, seq)
  )
  val edgeFactories: Array[(flatgraph.GNode, flatgraph.GNode, Int, Any) => flatgraph.Edge] = Array(
    (s, d, subseq, p) => new edges.AliasOf(s, d, subseq, p),
    (s, d, subseq, p) => new edges.Argument(s, d, subseq, p),
    (s, d, subseq, p) => new edges.Ast(s, d, subseq, p),
    (s, d, subseq, p) => new edges.Binds(s, d, subseq, p),
    (s, d, subseq, p) => new edges.BindsTo(s, d, subseq, p),
    (s, d, subseq, p) => new edges.Call(s, d, subseq, p),
    (s, d, subseq, p) => new edges.Capture(s, d, subseq, p),
    (s, d, subseq, p) => new edges.CapturedBy(s, d, subseq, p),
    (s, d, subseq, p) => new edges.Cdg(s, d, subseq, p),
    (s, d, subseq, p) => new edges.Cfg(s, d, subseq, p),
    (s, d, subseq, p) => new edges.Condition(s, d, subseq, p),
    (s, d, subseq, p) => new edges.Contains(s, d, subseq, p),
    (s, d, subseq, p) => new edges.Dominate(s, d, subseq, p),
    (s, d, subseq, p) => new edges.EvalType(s, d, subseq, p),
    (s, d, subseq, p) => new edges.Imports(s, d, subseq, p),
    (s, d, subseq, p) => new edges.InheritsFrom(s, d, subseq, p),
    (s, d, subseq, p) => new edges.IsCallForImport(s, d, subseq, p),
    (s, d, subseq, p) => new edges.ParameterLink(s, d, subseq, p),
    (s, d, subseq, p) => new edges.PostDominate(s, d, subseq, p),
    (s, d, subseq, p) => new edges.ReachingDef(s, d, subseq, p),
    (s, d, subseq, p) => new edges.Receiver(s, d, subseq, p),
    (s, d, subseq, p) => new edges.Ref(s, d, subseq, p),
    (s, d, subseq, p) => new edges.SourceFile(s, d, subseq, p),
    (s, d, subseq, p) => new edges.TaggedBy(s, d, subseq, p)
  )
  val nodePropertyAllocators: Array[Int => Array[?]] = Array(
    size => new Array[String](size),
    size => new Array[Int](size),
    size => new Array[String](size),
    size => new Array[String](size),
    size => new Array[String](size),
    size => new Array[String](size),
    size => new Array[String](size),
    size => new Array[String](size),
    size => new Array[String](size),
    size => new Array[String](size),
    size => new Array[String](size),
    size => new Array[Int](size),
    size => new Array[Int](size),
    size => new Array[String](size),
    size => new Array[String](size),
    size => new Array[String](size),
    size => new Array[String](size),
    size => new Array[String](size),
    size => new Array[String](size),
    size => new Array[String](size),
    size => new Array[Boolean](size),
    size => new Array[String](size),
    size => new Array[String](size),
    size => new Array[String](size),
    size => new Array[String](size),
    size => new Array[String](size),
    size => new Array[Int](size),
    size => new Array[String](size),
    size => new Array[Boolean](size),
    size => new Array[Boolean](size),
    size => new Array[Boolean](size),
    size => new Array[Boolean](size),
    size => new Array[String](size),
    size => new Array[String](size),
    size => new Array[Int](size),
    size => new Array[Int](size),
    size => new Array[String](size),
    size => new Array[String](size),
    size => new Array[String](size),
    size => new Array[String](size),
    size => new Array[String](size),
    size => new Array[String](size),
    size => new Array[Int](size),
    size => new Array[Int](size),
    size => new Array[Int](size),
    size => new Array[String](size),
    size => new Array[String](size),
    size => new Array[String](size),
    size => new Array[String](size),
    size => new Array[String](size),
    size => new Array[String](size),
    size => new Array[String](size),
    size => new Array[String](size),
    size => new Array[String](size),
    size => new Array[String](size),
    size => new Array[String](size),
    size => new Array[flatgraph.GNode](size),
    size => new Array[flatgraph.GNode](size),
    size => new Array[flatgraph.GNode](size),
    size => new Array[flatgraph.GNode](size)
  )
  val normalNodePropertyNames = Array(
    "ALIAS_TYPE_FULL_NAME",
    "ARGUMENT_INDEX",
    "ARGUMENT_NAME",
    "AST_PARENT_FULL_NAME",
    "AST_PARENT_TYPE",
    "CANONICAL_NAME",
    "CLASS_NAME",
    "CLASS_SHORT_NAME",
    "CLOSURE_BINDING_ID",
    "CLOSURE_ORIGINAL_NAME",
    "CODE",
    "COLUMN_NUMBER",
    "COLUMN_NUMBER_END",
    "CONTAINED_REF",
    "CONTENT",
    "CONTROL_STRUCTURE_TYPE",
    "DEPENDENCY_GROUP_ID",
    "DISPATCH_TYPE",
    "DYNAMIC_TYPE_HINT_FULL_NAME",
    "EVALUATION_STRATEGY",
    "EXPLICIT_AS",
    "FILENAME",
    "FULL_NAME",
    "HASH",
    "IMPORTED_AS",
    "IMPORTED_ENTITY",
    "INDEX",
    "INHERITS_FROM_TYPE_FULL_NAME",
    "IS_EXPLICIT",
    "IS_EXTERNAL",
    "IS_VARIADIC",
    "IS_WILDCARD",
    "KEY",
    "LANGUAGE",
    "LINE_NUMBER",
    "LINE_NUMBER_END",
    "METHOD_FULL_NAME",
    "METHOD_SHORT_NAME",
    "MODIFIER_TYPE",
    "MYPROPERTY",
    "NAME",
    "NODE_LABEL",
    "OFFSET",
    "OFFSET_END",
    "ORDER",
    "OVERLAYS",
    "PACKAGE_NAME",
    "PARSER_TYPE_NAME",
    "POSSIBLE_TYPES",
    "ROOT",
    "SIGNATURE",
    "SYMBOL",
    "TYPE_DECL_FULL_NAME",
    "TYPE_FULL_NAME",
    "VALUE",
    "VERSION"
  )
  val nodePropertyByLabel = normalNodePropertyNames.zipWithIndex.toMap
    .updated("evidence", 56)
    .updated("keyValuePairs", 57)
    .updated("node", 58)
    .updated("tag", 59)
  val nodePropertyDescriptors: Array[FormalQtyType.FormalQuantity | FormalQtyType.FormalType] = {
    val nodePropertyDescriptors = new Array[FormalQtyType.FormalQuantity | FormalQtyType.FormalType](5400)
    for (idx <- Range(0, 5400)) {
      nodePropertyDescriptors(idx) =
        if ((idx & 1) == 0) FormalQtyType.NothingType
        else FormalQtyType.QtyNone
    }

    nodePropertyDescriptors(90) = FormalQtyType.IntType // ANNOTATION.ARGUMENT_INDEX
    nodePropertyDescriptors(91) = FormalQtyType.QtyOne
    nodePropertyDescriptors(180) = FormalQtyType.StringType // ANNOTATION.ARGUMENT_NAME
    nodePropertyDescriptors(181) = FormalQtyType.QtyOption
    nodePropertyDescriptors(900) = FormalQtyType.StringType // ANNOTATION.CODE
    nodePropertyDescriptors(901) = FormalQtyType.QtyOne
    nodePropertyDescriptors(990) = FormalQtyType.IntType // ANNOTATION.COLUMN_NUMBER
    nodePropertyDescriptors(991) = FormalQtyType.QtyOption
    nodePropertyDescriptors(1980) = FormalQtyType.StringType // ANNOTATION.FULL_NAME
    nodePropertyDescriptors(1981) = FormalQtyType.QtyOne
    nodePropertyDescriptors(3060) = FormalQtyType.IntType // ANNOTATION.LINE_NUMBER
    nodePropertyDescriptors(3061) = FormalQtyType.QtyOption
    nodePropertyDescriptors(3600) = FormalQtyType.StringType // ANNOTATION.NAME
    nodePropertyDescriptors(3601) = FormalQtyType.QtyOne
    nodePropertyDescriptors(3960) = FormalQtyType.IntType // ANNOTATION.ORDER
    nodePropertyDescriptors(3961) = FormalQtyType.QtyOne
    nodePropertyDescriptors(92) = FormalQtyType.IntType // ANNOTATION_LITERAL.ARGUMENT_INDEX
    nodePropertyDescriptors(93) = FormalQtyType.QtyOne
    nodePropertyDescriptors(182) = FormalQtyType.StringType // ANNOTATION_LITERAL.ARGUMENT_NAME
    nodePropertyDescriptors(183) = FormalQtyType.QtyOption
    nodePropertyDescriptors(902) = FormalQtyType.StringType // ANNOTATION_LITERAL.CODE
    nodePropertyDescriptors(903) = FormalQtyType.QtyOne
    nodePropertyDescriptors(992) = FormalQtyType.IntType // ANNOTATION_LITERAL.COLUMN_NUMBER
    nodePropertyDescriptors(993) = FormalQtyType.QtyOption
    nodePropertyDescriptors(3062) = FormalQtyType.IntType // ANNOTATION_LITERAL.LINE_NUMBER
    nodePropertyDescriptors(3063) = FormalQtyType.QtyOption
    nodePropertyDescriptors(3602) = FormalQtyType.StringType // ANNOTATION_LITERAL.NAME
    nodePropertyDescriptors(3603) = FormalQtyType.QtyOne
    nodePropertyDescriptors(3962) = FormalQtyType.IntType // ANNOTATION_LITERAL.ORDER
    nodePropertyDescriptors(3963) = FormalQtyType.QtyOne
    nodePropertyDescriptors(904) = FormalQtyType.StringType // ANNOTATION_PARAMETER.CODE
    nodePropertyDescriptors(905) = FormalQtyType.QtyOne
    nodePropertyDescriptors(994) = FormalQtyType.IntType // ANNOTATION_PARAMETER.COLUMN_NUMBER
    nodePropertyDescriptors(995) = FormalQtyType.QtyOption
    nodePropertyDescriptors(3064) = FormalQtyType.IntType // ANNOTATION_PARAMETER.LINE_NUMBER
    nodePropertyDescriptors(3065) = FormalQtyType.QtyOption
    nodePropertyDescriptors(3964) = FormalQtyType.IntType // ANNOTATION_PARAMETER.ORDER
    nodePropertyDescriptors(3965) = FormalQtyType.QtyOne
    nodePropertyDescriptors(906) = FormalQtyType.StringType // ANNOTATION_PARAMETER_ASSIGN.CODE
    nodePropertyDescriptors(907) = FormalQtyType.QtyOne
    nodePropertyDescriptors(996) = FormalQtyType.IntType // ANNOTATION_PARAMETER_ASSIGN.COLUMN_NUMBER
    nodePropertyDescriptors(997) = FormalQtyType.QtyOption
    nodePropertyDescriptors(3066) = FormalQtyType.IntType // ANNOTATION_PARAMETER_ASSIGN.LINE_NUMBER
    nodePropertyDescriptors(3067) = FormalQtyType.QtyOption
    nodePropertyDescriptors(3966) = FormalQtyType.IntType // ANNOTATION_PARAMETER_ASSIGN.ORDER
    nodePropertyDescriptors(3967) = FormalQtyType.QtyOne
    nodePropertyDescriptors(98) = FormalQtyType.IntType // ARRAY_INITIALIZER.ARGUMENT_INDEX
    nodePropertyDescriptors(99) = FormalQtyType.QtyOne
    nodePropertyDescriptors(188) = FormalQtyType.StringType // ARRAY_INITIALIZER.ARGUMENT_NAME
    nodePropertyDescriptors(189) = FormalQtyType.QtyOption
    nodePropertyDescriptors(908) = FormalQtyType.StringType // ARRAY_INITIALIZER.CODE
    nodePropertyDescriptors(909) = FormalQtyType.QtyOne
    nodePropertyDescriptors(998) = FormalQtyType.IntType // ARRAY_INITIALIZER.COLUMN_NUMBER
    nodePropertyDescriptors(999) = FormalQtyType.QtyOption
    nodePropertyDescriptors(3068) = FormalQtyType.IntType // ARRAY_INITIALIZER.LINE_NUMBER
    nodePropertyDescriptors(3069) = FormalQtyType.QtyOption
    nodePropertyDescriptors(3968) = FormalQtyType.IntType // ARRAY_INITIALIZER.ORDER
    nodePropertyDescriptors(3969) = FormalQtyType.QtyOne
    nodePropertyDescriptors(3250) = FormalQtyType.StringType // BINDING.METHOD_FULL_NAME
    nodePropertyDescriptors(3251) = FormalQtyType.QtyOne
    nodePropertyDescriptors(3610) = FormalQtyType.StringType // BINDING.NAME
    nodePropertyDescriptors(3611) = FormalQtyType.QtyOne
    nodePropertyDescriptors(4510) = FormalQtyType.StringType // BINDING.SIGNATURE
    nodePropertyDescriptors(4511) = FormalQtyType.QtyOne
    nodePropertyDescriptors(102) = FormalQtyType.IntType // BLOCK.ARGUMENT_INDEX
    nodePropertyDescriptors(103) = FormalQtyType.QtyOne
    nodePropertyDescriptors(192) = FormalQtyType.StringType // BLOCK.ARGUMENT_NAME
    nodePropertyDescriptors(193) = FormalQtyType.QtyOption
    nodePropertyDescriptors(912) = FormalQtyType.StringType // BLOCK.CODE
    nodePropertyDescriptors(913) = FormalQtyType.QtyOne
    nodePropertyDescriptors(1002) = FormalQtyType.IntType // BLOCK.COLUMN_NUMBER
    nodePropertyDescriptors(1003) = FormalQtyType.QtyOption
    nodePropertyDescriptors(1632) = FormalQtyType.StringType // BLOCK.DYNAMIC_TYPE_HINT_FULL_NAME
    nodePropertyDescriptors(1633) = FormalQtyType.QtyMulti
    nodePropertyDescriptors(3072) = FormalQtyType.IntType // BLOCK.LINE_NUMBER
    nodePropertyDescriptors(3073) = FormalQtyType.QtyOption
    nodePropertyDescriptors(3972) = FormalQtyType.IntType // BLOCK.ORDER
    nodePropertyDescriptors(3973) = FormalQtyType.QtyOne
    nodePropertyDescriptors(4332) = FormalQtyType.StringType // BLOCK.POSSIBLE_TYPES
    nodePropertyDescriptors(4333) = FormalQtyType.QtyMulti
    nodePropertyDescriptors(4782) = FormalQtyType.StringType // BLOCK.TYPE_FULL_NAME
    nodePropertyDescriptors(4783) = FormalQtyType.QtyOne
    nodePropertyDescriptors(104) = FormalQtyType.IntType // CALL.ARGUMENT_INDEX
    nodePropertyDescriptors(105) = FormalQtyType.QtyOne
    nodePropertyDescriptors(194) = FormalQtyType.StringType // CALL.ARGUMENT_NAME
    nodePropertyDescriptors(195) = FormalQtyType.QtyOption
    nodePropertyDescriptors(914) = FormalQtyType.StringType // CALL.CODE
    nodePropertyDescriptors(915) = FormalQtyType.QtyOne
    nodePropertyDescriptors(1004) = FormalQtyType.IntType // CALL.COLUMN_NUMBER
    nodePropertyDescriptors(1005) = FormalQtyType.QtyOption
    nodePropertyDescriptors(1544) = FormalQtyType.StringType // CALL.DISPATCH_TYPE
    nodePropertyDescriptors(1545) = FormalQtyType.QtyOne
    nodePropertyDescriptors(1634) = FormalQtyType.StringType // CALL.DYNAMIC_TYPE_HINT_FULL_NAME
    nodePropertyDescriptors(1635) = FormalQtyType.QtyMulti
    nodePropertyDescriptors(3074) = FormalQtyType.IntType // CALL.LINE_NUMBER
    nodePropertyDescriptors(3075) = FormalQtyType.QtyOption
    nodePropertyDescriptors(3254) = FormalQtyType.StringType // CALL.METHOD_FULL_NAME
    nodePropertyDescriptors(3255) = FormalQtyType.QtyOne
    nodePropertyDescriptors(3614) = FormalQtyType.StringType // CALL.NAME
    nodePropertyDescriptors(3615) = FormalQtyType.QtyOne
    nodePropertyDescriptors(3974) = FormalQtyType.IntType // CALL.ORDER
    nodePropertyDescriptors(3975) = FormalQtyType.QtyOne
    nodePropertyDescriptors(4334) = FormalQtyType.StringType // CALL.POSSIBLE_TYPES
    nodePropertyDescriptors(4335) = FormalQtyType.QtyMulti
    nodePropertyDescriptors(4514) = FormalQtyType.StringType // CALL.SIGNATURE
    nodePropertyDescriptors(4515) = FormalQtyType.QtyOne
    nodePropertyDescriptors(4784) = FormalQtyType.StringType // CALL.TYPE_FULL_NAME
    nodePropertyDescriptors(4785) = FormalQtyType.QtyOne
    nodePropertyDescriptors(736) = FormalQtyType.StringType // CLOSURE_BINDING.CLOSURE_BINDING_ID
    nodePropertyDescriptors(737) = FormalQtyType.QtyOption
    nodePropertyDescriptors(826) = FormalQtyType.StringType // CLOSURE_BINDING.CLOSURE_ORIGINAL_NAME
    nodePropertyDescriptors(827) = FormalQtyType.QtyOption
    nodePropertyDescriptors(1726) = FormalQtyType.StringType // CLOSURE_BINDING.EVALUATION_STRATEGY
    nodePropertyDescriptors(1727) = FormalQtyType.QtyOne
    nodePropertyDescriptors(918) = FormalQtyType.StringType // COMMENT.CODE
    nodePropertyDescriptors(919) = FormalQtyType.QtyOne
    nodePropertyDescriptors(1008) = FormalQtyType.IntType // COMMENT.COLUMN_NUMBER
    nodePropertyDescriptors(1009) = FormalQtyType.QtyOption
    nodePropertyDescriptors(1908) = FormalQtyType.StringType // COMMENT.FILENAME
    nodePropertyDescriptors(1909) = FormalQtyType.QtyOne
    nodePropertyDescriptors(3078) = FormalQtyType.IntType // COMMENT.LINE_NUMBER
    nodePropertyDescriptors(3079) = FormalQtyType.QtyOption
    nodePropertyDescriptors(3978) = FormalQtyType.IntType // COMMENT.ORDER
    nodePropertyDescriptors(3979) = FormalQtyType.QtyOne
    nodePropertyDescriptors(1280) = FormalQtyType.StringType // CONFIG_FILE.CONTENT
    nodePropertyDescriptors(1281) = FormalQtyType.QtyOne
    nodePropertyDescriptors(3620) = FormalQtyType.StringType // CONFIG_FILE.NAME
    nodePropertyDescriptors(3621) = FormalQtyType.QtyOne
    nodePropertyDescriptors(112) = FormalQtyType.IntType // CONTROL_STRUCTURE.ARGUMENT_INDEX
    nodePropertyDescriptors(113) = FormalQtyType.QtyOne
    nodePropertyDescriptors(202) = FormalQtyType.StringType // CONTROL_STRUCTURE.ARGUMENT_NAME
    nodePropertyDescriptors(203) = FormalQtyType.QtyOption
    nodePropertyDescriptors(922) = FormalQtyType.StringType // CONTROL_STRUCTURE.CODE
    nodePropertyDescriptors(923) = FormalQtyType.QtyOne
    nodePropertyDescriptors(1012) = FormalQtyType.IntType // CONTROL_STRUCTURE.COLUMN_NUMBER
    nodePropertyDescriptors(1013) = FormalQtyType.QtyOption
    nodePropertyDescriptors(1372) = FormalQtyType.StringType // CONTROL_STRUCTURE.CONTROL_STRUCTURE_TYPE
    nodePropertyDescriptors(1373) = FormalQtyType.QtyOne
    nodePropertyDescriptors(3082) = FormalQtyType.IntType // CONTROL_STRUCTURE.LINE_NUMBER
    nodePropertyDescriptors(3083) = FormalQtyType.QtyOption
    nodePropertyDescriptors(3982) = FormalQtyType.IntType // CONTROL_STRUCTURE.ORDER
    nodePropertyDescriptors(3983) = FormalQtyType.QtyOne
    nodePropertyDescriptors(4252) = FormalQtyType.StringType // CONTROL_STRUCTURE.PARSER_TYPE_NAME
    nodePropertyDescriptors(4253) = FormalQtyType.QtyOne
    nodePropertyDescriptors(1464) = FormalQtyType.StringType // DEPENDENCY.DEPENDENCY_GROUP_ID
    nodePropertyDescriptors(1465) = FormalQtyType.QtyOption
    nodePropertyDescriptors(3624) = FormalQtyType.StringType // DEPENDENCY.NAME
    nodePropertyDescriptors(3625) = FormalQtyType.QtyOne
    nodePropertyDescriptors(4974) = FormalQtyType.StringType // DEPENDENCY.VERSION
    nodePropertyDescriptors(4975) = FormalQtyType.QtyOne
    nodePropertyDescriptors(116) = FormalQtyType.IntType // FIELD_IDENTIFIER.ARGUMENT_INDEX
    nodePropertyDescriptors(117) = FormalQtyType.QtyOne
    nodePropertyDescriptors(206) = FormalQtyType.StringType // FIELD_IDENTIFIER.ARGUMENT_NAME
    nodePropertyDescriptors(207) = FormalQtyType.QtyOption
    nodePropertyDescriptors(476) = FormalQtyType.StringType // FIELD_IDENTIFIER.CANONICAL_NAME
    nodePropertyDescriptors(477) = FormalQtyType.QtyOne
    nodePropertyDescriptors(926) = FormalQtyType.StringType // FIELD_IDENTIFIER.CODE
    nodePropertyDescriptors(927) = FormalQtyType.QtyOne
    nodePropertyDescriptors(1016) = FormalQtyType.IntType // FIELD_IDENTIFIER.COLUMN_NUMBER
    nodePropertyDescriptors(1017) = FormalQtyType.QtyOption
    nodePropertyDescriptors(3086) = FormalQtyType.IntType // FIELD_IDENTIFIER.LINE_NUMBER
    nodePropertyDescriptors(3087) = FormalQtyType.QtyOption
    nodePropertyDescriptors(3986) = FormalQtyType.IntType // FIELD_IDENTIFIER.ORDER
    nodePropertyDescriptors(3987) = FormalQtyType.QtyOne
    nodePropertyDescriptors(928) = FormalQtyType.StringType // FILE.CODE
    nodePropertyDescriptors(929) = FormalQtyType.QtyOne
    nodePropertyDescriptors(1018) = FormalQtyType.IntType // FILE.COLUMN_NUMBER
    nodePropertyDescriptors(1019) = FormalQtyType.QtyOption
    nodePropertyDescriptors(1288) = FormalQtyType.StringType // FILE.CONTENT
    nodePropertyDescriptors(1289) = FormalQtyType.QtyOne
    nodePropertyDescriptors(2098) = FormalQtyType.StringType // FILE.HASH
    nodePropertyDescriptors(2099) = FormalQtyType.QtyOption
    nodePropertyDescriptors(3088) = FormalQtyType.IntType // FILE.LINE_NUMBER
    nodePropertyDescriptors(3089) = FormalQtyType.QtyOption
    nodePropertyDescriptors(3628) = FormalQtyType.StringType // FILE.NAME
    nodePropertyDescriptors(3629) = FormalQtyType.QtyOne
    nodePropertyDescriptors(3988) = FormalQtyType.IntType // FILE.ORDER
    nodePropertyDescriptors(3989) = FormalQtyType.QtyOne
    nodePropertyDescriptors(5070) = FormalQtyType.RefType // FINDING.evidence
    nodePropertyDescriptors(5071) = FormalQtyType.QtyMulti
    nodePropertyDescriptors(5160) = FormalQtyType.RefType // FINDING.keyValuePairs
    nodePropertyDescriptors(5161) = FormalQtyType.QtyMulti
    nodePropertyDescriptors(122) = FormalQtyType.IntType // IDENTIFIER.ARGUMENT_INDEX
    nodePropertyDescriptors(123) = FormalQtyType.QtyOne
    nodePropertyDescriptors(212) = FormalQtyType.StringType // IDENTIFIER.ARGUMENT_NAME
    nodePropertyDescriptors(213) = FormalQtyType.QtyOption
    nodePropertyDescriptors(932) = FormalQtyType.StringType // IDENTIFIER.CODE
    nodePropertyDescriptors(933) = FormalQtyType.QtyOne
    nodePropertyDescriptors(1022) = FormalQtyType.IntType // IDENTIFIER.COLUMN_NUMBER
    nodePropertyDescriptors(1023) = FormalQtyType.QtyOption
    nodePropertyDescriptors(1652) = FormalQtyType.StringType // IDENTIFIER.DYNAMIC_TYPE_HINT_FULL_NAME
    nodePropertyDescriptors(1653) = FormalQtyType.QtyMulti
    nodePropertyDescriptors(3092) = FormalQtyType.IntType // IDENTIFIER.LINE_NUMBER
    nodePropertyDescriptors(3093) = FormalQtyType.QtyOption
    nodePropertyDescriptors(3632) = FormalQtyType.StringType // IDENTIFIER.NAME
    nodePropertyDescriptors(3633) = FormalQtyType.QtyOne
    nodePropertyDescriptors(3992) = FormalQtyType.IntType // IDENTIFIER.ORDER
    nodePropertyDescriptors(3993) = FormalQtyType.QtyOne
    nodePropertyDescriptors(4352) = FormalQtyType.StringType // IDENTIFIER.POSSIBLE_TYPES
    nodePropertyDescriptors(4353) = FormalQtyType.QtyMulti
    nodePropertyDescriptors(4802) = FormalQtyType.StringType // IDENTIFIER.TYPE_FULL_NAME
    nodePropertyDescriptors(4803) = FormalQtyType.QtyOne
    nodePropertyDescriptors(934) = FormalQtyType.StringType // IMPORT.CODE
    nodePropertyDescriptors(935) = FormalQtyType.QtyOne
    nodePropertyDescriptors(1024) = FormalQtyType.IntType // IMPORT.COLUMN_NUMBER
    nodePropertyDescriptors(1025) = FormalQtyType.QtyOption
    nodePropertyDescriptors(1834) = FormalQtyType.BoolType // IMPORT.EXPLICIT_AS
    nodePropertyDescriptors(1835) = FormalQtyType.QtyOption
    nodePropertyDescriptors(2194) = FormalQtyType.StringType // IMPORT.IMPORTED_AS
    nodePropertyDescriptors(2195) = FormalQtyType.QtyOption
    nodePropertyDescriptors(2284) = FormalQtyType.StringType // IMPORT.IMPORTED_ENTITY
    nodePropertyDescriptors(2285) = FormalQtyType.QtyOption
    nodePropertyDescriptors(2554) = FormalQtyType.BoolType // IMPORT.IS_EXPLICIT
    nodePropertyDescriptors(2555) = FormalQtyType.QtyOption
    nodePropertyDescriptors(2824) = FormalQtyType.BoolType // IMPORT.IS_WILDCARD
    nodePropertyDescriptors(2825) = FormalQtyType.QtyOption
    nodePropertyDescriptors(3094) = FormalQtyType.IntType // IMPORT.LINE_NUMBER
    nodePropertyDescriptors(3095) = FormalQtyType.QtyOption
    nodePropertyDescriptors(3994) = FormalQtyType.IntType // IMPORT.ORDER
    nodePropertyDescriptors(3995) = FormalQtyType.QtyOne
    nodePropertyDescriptors(936) = FormalQtyType.StringType // JUMP_LABEL.CODE
    nodePropertyDescriptors(937) = FormalQtyType.QtyOne
    nodePropertyDescriptors(1026) = FormalQtyType.IntType // JUMP_LABEL.COLUMN_NUMBER
    nodePropertyDescriptors(1027) = FormalQtyType.QtyOption
    nodePropertyDescriptors(3096) = FormalQtyType.IntType // JUMP_LABEL.LINE_NUMBER
    nodePropertyDescriptors(3097) = FormalQtyType.QtyOption
    nodePropertyDescriptors(3636) = FormalQtyType.StringType // JUMP_LABEL.NAME
    nodePropertyDescriptors(3637) = FormalQtyType.QtyOne
    nodePropertyDescriptors(3996) = FormalQtyType.IntType // JUMP_LABEL.ORDER
    nodePropertyDescriptors(3997) = FormalQtyType.QtyOne
    nodePropertyDescriptors(4266) = FormalQtyType.StringType // JUMP_LABEL.PARSER_TYPE_NAME
    nodePropertyDescriptors(4267) = FormalQtyType.QtyOne
    nodePropertyDescriptors(128) = FormalQtyType.IntType // JUMP_TARGET.ARGUMENT_INDEX
    nodePropertyDescriptors(129) = FormalQtyType.QtyOne
    nodePropertyDescriptors(938) = FormalQtyType.StringType // JUMP_TARGET.CODE
    nodePropertyDescriptors(939) = FormalQtyType.QtyOne
    nodePropertyDescriptors(1028) = FormalQtyType.IntType // JUMP_TARGET.COLUMN_NUMBER
    nodePropertyDescriptors(1029) = FormalQtyType.QtyOption
    nodePropertyDescriptors(3098) = FormalQtyType.IntType // JUMP_TARGET.LINE_NUMBER
    nodePropertyDescriptors(3099) = FormalQtyType.QtyOption
    nodePropertyDescriptors(3638) = FormalQtyType.StringType // JUMP_TARGET.NAME
    nodePropertyDescriptors(3639) = FormalQtyType.QtyOne
    nodePropertyDescriptors(3998) = FormalQtyType.IntType // JUMP_TARGET.ORDER
    nodePropertyDescriptors(3999) = FormalQtyType.QtyOne
    nodePropertyDescriptors(4268) = FormalQtyType.StringType // JUMP_TARGET.PARSER_TYPE_NAME
    nodePropertyDescriptors(4269) = FormalQtyType.QtyOne
    nodePropertyDescriptors(2920) = FormalQtyType.StringType // KEY_VALUE_PAIR.KEY
    nodePropertyDescriptors(2921) = FormalQtyType.QtyOne
    nodePropertyDescriptors(4900) = FormalQtyType.StringType // KEY_VALUE_PAIR.VALUE
    nodePropertyDescriptors(4901) = FormalQtyType.QtyOne
    nodePropertyDescriptors(132) = FormalQtyType.IntType // LITERAL.ARGUMENT_INDEX
    nodePropertyDescriptors(133) = FormalQtyType.QtyOne
    nodePropertyDescriptors(222) = FormalQtyType.StringType // LITERAL.ARGUMENT_NAME
    nodePropertyDescriptors(223) = FormalQtyType.QtyOption
    nodePropertyDescriptors(942) = FormalQtyType.StringType // LITERAL.CODE
    nodePropertyDescriptors(943) = FormalQtyType.QtyOne
    nodePropertyDescriptors(1032) = FormalQtyType.IntType // LITERAL.COLUMN_NUMBER
    nodePropertyDescriptors(1033) = FormalQtyType.QtyOption
    nodePropertyDescriptors(1662) = FormalQtyType.StringType // LITERAL.DYNAMIC_TYPE_HINT_FULL_NAME
    nodePropertyDescriptors(1663) = FormalQtyType.QtyMulti
    nodePropertyDescriptors(3102) = FormalQtyType.IntType // LITERAL.LINE_NUMBER
    nodePropertyDescriptors(3103) = FormalQtyType.QtyOption
    nodePropertyDescriptors(4002) = FormalQtyType.IntType // LITERAL.ORDER
    nodePropertyDescriptors(4003) = FormalQtyType.QtyOne
    nodePropertyDescriptors(4362) = FormalQtyType.StringType // LITERAL.POSSIBLE_TYPES
    nodePropertyDescriptors(4363) = FormalQtyType.QtyMulti
    nodePropertyDescriptors(4812) = FormalQtyType.StringType // LITERAL.TYPE_FULL_NAME
    nodePropertyDescriptors(4813) = FormalQtyType.QtyOne
    nodePropertyDescriptors(764) = FormalQtyType.StringType // LOCAL.CLOSURE_BINDING_ID
    nodePropertyDescriptors(765) = FormalQtyType.QtyOption
    nodePropertyDescriptors(944) = FormalQtyType.StringType // LOCAL.CODE
    nodePropertyDescriptors(945) = FormalQtyType.QtyOne
    nodePropertyDescriptors(1034) = FormalQtyType.IntType // LOCAL.COLUMN_NUMBER
    nodePropertyDescriptors(1035) = FormalQtyType.QtyOption
    nodePropertyDescriptors(1664) = FormalQtyType.StringType // LOCAL.DYNAMIC_TYPE_HINT_FULL_NAME
    nodePropertyDescriptors(1665) = FormalQtyType.QtyMulti
    nodePropertyDescriptors(3104) = FormalQtyType.IntType // LOCAL.LINE_NUMBER
    nodePropertyDescriptors(3105) = FormalQtyType.QtyOption
    nodePropertyDescriptors(3644) = FormalQtyType.StringType // LOCAL.NAME
    nodePropertyDescriptors(3645) = FormalQtyType.QtyOne
    nodePropertyDescriptors(4004) = FormalQtyType.IntType // LOCAL.ORDER
    nodePropertyDescriptors(4005) = FormalQtyType.QtyOne
    nodePropertyDescriptors(4364) = FormalQtyType.StringType // LOCAL.POSSIBLE_TYPES
    nodePropertyDescriptors(4365) = FormalQtyType.QtyMulti
    nodePropertyDescriptors(4814) = FormalQtyType.StringType // LOCAL.TYPE_FULL_NAME
    nodePropertyDescriptors(4815) = FormalQtyType.QtyOne
    nodePropertyDescriptors(586) = FormalQtyType.StringType // LOCATION.CLASS_NAME
    nodePropertyDescriptors(587) = FormalQtyType.QtyOne
    nodePropertyDescriptors(676) = FormalQtyType.StringType // LOCATION.CLASS_SHORT_NAME
    nodePropertyDescriptors(677) = FormalQtyType.QtyOne
    nodePropertyDescriptors(1936) = FormalQtyType.StringType // LOCATION.FILENAME
    nodePropertyDescriptors(1937) = FormalQtyType.QtyOne
    nodePropertyDescriptors(3106) = FormalQtyType.IntType // LOCATION.LINE_NUMBER
    nodePropertyDescriptors(3107) = FormalQtyType.QtyOption
    nodePropertyDescriptors(3286) = FormalQtyType.StringType // LOCATION.METHOD_FULL_NAME
    nodePropertyDescriptors(3287) = FormalQtyType.QtyOne
    nodePropertyDescriptors(3376) = FormalQtyType.StringType // LOCATION.METHOD_SHORT_NAME
    nodePropertyDescriptors(3377) = FormalQtyType.QtyOne
    nodePropertyDescriptors(3736) = FormalQtyType.StringType // LOCATION.NODE_LABEL
    nodePropertyDescriptors(3737) = FormalQtyType.QtyOne
    nodePropertyDescriptors(4186) = FormalQtyType.StringType // LOCATION.PACKAGE_NAME
    nodePropertyDescriptors(4187) = FormalQtyType.QtyOne
    nodePropertyDescriptors(4636) = FormalQtyType.StringType // LOCATION.SYMBOL
    nodePropertyDescriptors(4637) = FormalQtyType.QtyOne
    nodePropertyDescriptors(5266) = FormalQtyType.RefType // LOCATION.node
    nodePropertyDescriptors(5267) = FormalQtyType.QtyOption
    nodePropertyDescriptors(318) = FormalQtyType.StringType // MEMBER.AST_PARENT_FULL_NAME
    nodePropertyDescriptors(319) = FormalQtyType.QtyOne
    nodePropertyDescriptors(408) = FormalQtyType.StringType // MEMBER.AST_PARENT_TYPE
    nodePropertyDescriptors(409) = FormalQtyType.QtyOne
    nodePropertyDescriptors(948) = FormalQtyType.StringType // MEMBER.CODE
    nodePropertyDescriptors(949) = FormalQtyType.QtyOne
    nodePropertyDescriptors(1038) = FormalQtyType.IntType // MEMBER.COLUMN_NUMBER
    nodePropertyDescriptors(1039) = FormalQtyType.QtyOption
    nodePropertyDescriptors(1668) = FormalQtyType.StringType // MEMBER.DYNAMIC_TYPE_HINT_FULL_NAME
    nodePropertyDescriptors(1669) = FormalQtyType.QtyMulti
    nodePropertyDescriptors(3108) = FormalQtyType.IntType // MEMBER.LINE_NUMBER
    nodePropertyDescriptors(3109) = FormalQtyType.QtyOption
    nodePropertyDescriptors(3648) = FormalQtyType.StringType // MEMBER.NAME
    nodePropertyDescriptors(3649) = FormalQtyType.QtyOne
    nodePropertyDescriptors(4008) = FormalQtyType.IntType // MEMBER.ORDER
    nodePropertyDescriptors(4009) = FormalQtyType.QtyOne
    nodePropertyDescriptors(4368) = FormalQtyType.StringType // MEMBER.POSSIBLE_TYPES
    nodePropertyDescriptors(4369) = FormalQtyType.QtyMulti
    nodePropertyDescriptors(4818) = FormalQtyType.StringType // MEMBER.TYPE_FULL_NAME
    nodePropertyDescriptors(4819) = FormalQtyType.QtyOne
    nodePropertyDescriptors(2120) = FormalQtyType.StringType // META_DATA.HASH
    nodePropertyDescriptors(2121) = FormalQtyType.QtyOption
    nodePropertyDescriptors(3020) = FormalQtyType.StringType // META_DATA.LANGUAGE
    nodePropertyDescriptors(3021) = FormalQtyType.QtyOne
    nodePropertyDescriptors(4100) = FormalQtyType.StringType // META_DATA.OVERLAYS
    nodePropertyDescriptors(4101) = FormalQtyType.QtyMulti
    nodePropertyDescriptors(4460) = FormalQtyType.StringType // META_DATA.ROOT
    nodePropertyDescriptors(4461) = FormalQtyType.QtyOne
    nodePropertyDescriptors(5000) = FormalQtyType.StringType // META_DATA.VERSION
    nodePropertyDescriptors(5001) = FormalQtyType.QtyOne
    nodePropertyDescriptors(322) = FormalQtyType.StringType // METHOD.AST_PARENT_FULL_NAME
    nodePropertyDescriptors(323) = FormalQtyType.QtyOne
    nodePropertyDescriptors(412) = FormalQtyType.StringType // METHOD.AST_PARENT_TYPE
    nodePropertyDescriptors(413) = FormalQtyType.QtyOne
    nodePropertyDescriptors(952) = FormalQtyType.StringType // METHOD.CODE
    nodePropertyDescriptors(953) = FormalQtyType.QtyOne
    nodePropertyDescriptors(1042) = FormalQtyType.IntType // METHOD.COLUMN_NUMBER
    nodePropertyDescriptors(1043) = FormalQtyType.QtyOption
    nodePropertyDescriptors(1132) = FormalQtyType.IntType // METHOD.COLUMN_NUMBER_END
    nodePropertyDescriptors(1133) = FormalQtyType.QtyOption
    nodePropertyDescriptors(1942) = FormalQtyType.StringType // METHOD.FILENAME
    nodePropertyDescriptors(1943) = FormalQtyType.QtyOne
    nodePropertyDescriptors(2032) = FormalQtyType.StringType // METHOD.FULL_NAME
    nodePropertyDescriptors(2033) = FormalQtyType.QtyOne
    nodePropertyDescriptors(2122) = FormalQtyType.StringType // METHOD.HASH
    nodePropertyDescriptors(2123) = FormalQtyType.QtyOption
    nodePropertyDescriptors(2662) = FormalQtyType.BoolType // METHOD.IS_EXTERNAL
    nodePropertyDescriptors(2663) = FormalQtyType.QtyOne
    nodePropertyDescriptors(3112) = FormalQtyType.IntType // METHOD.LINE_NUMBER
    nodePropertyDescriptors(3113) = FormalQtyType.QtyOption
    nodePropertyDescriptors(3202) = FormalQtyType.IntType // METHOD.LINE_NUMBER_END
    nodePropertyDescriptors(3203) = FormalQtyType.QtyOption
    nodePropertyDescriptors(3652) = FormalQtyType.StringType // METHOD.NAME
    nodePropertyDescriptors(3653) = FormalQtyType.QtyOne
    nodePropertyDescriptors(3832) = FormalQtyType.IntType // METHOD.OFFSET
    nodePropertyDescriptors(3833) = FormalQtyType.QtyOption
    nodePropertyDescriptors(3922) = FormalQtyType.IntType // METHOD.OFFSET_END
    nodePropertyDescriptors(3923) = FormalQtyType.QtyOption
    nodePropertyDescriptors(4012) = FormalQtyType.IntType // METHOD.ORDER
    nodePropertyDescriptors(4013) = FormalQtyType.QtyOne
    nodePropertyDescriptors(4552) = FormalQtyType.StringType // METHOD.SIGNATURE
    nodePropertyDescriptors(4553) = FormalQtyType.QtyOne
    nodePropertyDescriptors(774) = FormalQtyType.StringType // METHOD_PARAMETER_IN.CLOSURE_BINDING_ID
    nodePropertyDescriptors(775) = FormalQtyType.QtyOption
    nodePropertyDescriptors(954) = FormalQtyType.StringType // METHOD_PARAMETER_IN.CODE
    nodePropertyDescriptors(955) = FormalQtyType.QtyOne
    nodePropertyDescriptors(1044) = FormalQtyType.IntType // METHOD_PARAMETER_IN.COLUMN_NUMBER
    nodePropertyDescriptors(1045) = FormalQtyType.QtyOption
    nodePropertyDescriptors(1674) = FormalQtyType.StringType // METHOD_PARAMETER_IN.DYNAMIC_TYPE_HINT_FULL_NAME
    nodePropertyDescriptors(1675) = FormalQtyType.QtyMulti
    nodePropertyDescriptors(1764) = FormalQtyType.StringType // METHOD_PARAMETER_IN.EVALUATION_STRATEGY
    nodePropertyDescriptors(1765) = FormalQtyType.QtyOne
    nodePropertyDescriptors(2394) = FormalQtyType.IntType // METHOD_PARAMETER_IN.INDEX
    nodePropertyDescriptors(2395) = FormalQtyType.QtyOne
    nodePropertyDescriptors(2754) = FormalQtyType.BoolType // METHOD_PARAMETER_IN.IS_VARIADIC
    nodePropertyDescriptors(2755) = FormalQtyType.QtyOne
    nodePropertyDescriptors(3114) = FormalQtyType.IntType // METHOD_PARAMETER_IN.LINE_NUMBER
    nodePropertyDescriptors(3115) = FormalQtyType.QtyOption
    nodePropertyDescriptors(3654) = FormalQtyType.StringType // METHOD_PARAMETER_IN.NAME
    nodePropertyDescriptors(3655) = FormalQtyType.QtyOne
    nodePropertyDescriptors(4014) = FormalQtyType.IntType // METHOD_PARAMETER_IN.ORDER
    nodePropertyDescriptors(4015) = FormalQtyType.QtyOne
    nodePropertyDescriptors(4374) = FormalQtyType.StringType // METHOD_PARAMETER_IN.POSSIBLE_TYPES
    nodePropertyDescriptors(4375) = FormalQtyType.QtyMulti
    nodePropertyDescriptors(4824) = FormalQtyType.StringType // METHOD_PARAMETER_IN.TYPE_FULL_NAME
    nodePropertyDescriptors(4825) = FormalQtyType.QtyOne
    nodePropertyDescriptors(956) = FormalQtyType.StringType // METHOD_PARAMETER_OUT.CODE
    nodePropertyDescriptors(957) = FormalQtyType.QtyOne
    nodePropertyDescriptors(1046) = FormalQtyType.IntType // METHOD_PARAMETER_OUT.COLUMN_NUMBER
    nodePropertyDescriptors(1047) = FormalQtyType.QtyOption
    nodePropertyDescriptors(1766) = FormalQtyType.StringType // METHOD_PARAMETER_OUT.EVALUATION_STRATEGY
    nodePropertyDescriptors(1767) = FormalQtyType.QtyOne
    nodePropertyDescriptors(2396) = FormalQtyType.IntType // METHOD_PARAMETER_OUT.INDEX
    nodePropertyDescriptors(2397) = FormalQtyType.QtyOne
    nodePropertyDescriptors(2756) = FormalQtyType.BoolType // METHOD_PARAMETER_OUT.IS_VARIADIC
    nodePropertyDescriptors(2757) = FormalQtyType.QtyOne
    nodePropertyDescriptors(3116) = FormalQtyType.IntType // METHOD_PARAMETER_OUT.LINE_NUMBER
    nodePropertyDescriptors(3117) = FormalQtyType.QtyOption
    nodePropertyDescriptors(3656) = FormalQtyType.StringType // METHOD_PARAMETER_OUT.NAME
    nodePropertyDescriptors(3657) = FormalQtyType.QtyOne
    nodePropertyDescriptors(4016) = FormalQtyType.IntType // METHOD_PARAMETER_OUT.ORDER
    nodePropertyDescriptors(4017) = FormalQtyType.QtyOne
    nodePropertyDescriptors(4826) = FormalQtyType.StringType // METHOD_PARAMETER_OUT.TYPE_FULL_NAME
    nodePropertyDescriptors(4827) = FormalQtyType.QtyOne
    nodePropertyDescriptors(148) = FormalQtyType.IntType // METHOD_REF.ARGUMENT_INDEX
    nodePropertyDescriptors(149) = FormalQtyType.QtyOne
    nodePropertyDescriptors(238) = FormalQtyType.StringType // METHOD_REF.ARGUMENT_NAME
    nodePropertyDescriptors(239) = FormalQtyType.QtyOption
    nodePropertyDescriptors(958) = FormalQtyType.StringType // METHOD_REF.CODE
    nodePropertyDescriptors(959) = FormalQtyType.QtyOne
    nodePropertyDescriptors(1048) = FormalQtyType.IntType // METHOD_REF.COLUMN_NUMBER
    nodePropertyDescriptors(1049) = FormalQtyType.QtyOption
    nodePropertyDescriptors(1678) = FormalQtyType.StringType // METHOD_REF.DYNAMIC_TYPE_HINT_FULL_NAME
    nodePropertyDescriptors(1679) = FormalQtyType.QtyMulti
    nodePropertyDescriptors(3118) = FormalQtyType.IntType // METHOD_REF.LINE_NUMBER
    nodePropertyDescriptors(3119) = FormalQtyType.QtyOption
    nodePropertyDescriptors(3298) = FormalQtyType.StringType // METHOD_REF.METHOD_FULL_NAME
    nodePropertyDescriptors(3299) = FormalQtyType.QtyOne
    nodePropertyDescriptors(4018) = FormalQtyType.IntType // METHOD_REF.ORDER
    nodePropertyDescriptors(4019) = FormalQtyType.QtyOne
    nodePropertyDescriptors(4378) = FormalQtyType.StringType // METHOD_REF.POSSIBLE_TYPES
    nodePropertyDescriptors(4379) = FormalQtyType.QtyMulti
    nodePropertyDescriptors(4828) = FormalQtyType.StringType // METHOD_REF.TYPE_FULL_NAME
    nodePropertyDescriptors(4829) = FormalQtyType.QtyOne
    nodePropertyDescriptors(960) = FormalQtyType.StringType // METHOD_RETURN.CODE
    nodePropertyDescriptors(961) = FormalQtyType.QtyOne
    nodePropertyDescriptors(1050) = FormalQtyType.IntType // METHOD_RETURN.COLUMN_NUMBER
    nodePropertyDescriptors(1051) = FormalQtyType.QtyOption
    nodePropertyDescriptors(1680) = FormalQtyType.StringType // METHOD_RETURN.DYNAMIC_TYPE_HINT_FULL_NAME
    nodePropertyDescriptors(1681) = FormalQtyType.QtyMulti
    nodePropertyDescriptors(1770) = FormalQtyType.StringType // METHOD_RETURN.EVALUATION_STRATEGY
    nodePropertyDescriptors(1771) = FormalQtyType.QtyOne
    nodePropertyDescriptors(3120) = FormalQtyType.IntType // METHOD_RETURN.LINE_NUMBER
    nodePropertyDescriptors(3121) = FormalQtyType.QtyOption
    nodePropertyDescriptors(4020) = FormalQtyType.IntType // METHOD_RETURN.ORDER
    nodePropertyDescriptors(4021) = FormalQtyType.QtyOne
    nodePropertyDescriptors(4380) = FormalQtyType.StringType // METHOD_RETURN.POSSIBLE_TYPES
    nodePropertyDescriptors(4381) = FormalQtyType.QtyMulti
    nodePropertyDescriptors(4830) = FormalQtyType.StringType // METHOD_RETURN.TYPE_FULL_NAME
    nodePropertyDescriptors(4831) = FormalQtyType.QtyOne
    nodePropertyDescriptors(962) = FormalQtyType.StringType // MODIFIER.CODE
    nodePropertyDescriptors(963) = FormalQtyType.QtyOne
    nodePropertyDescriptors(1052) = FormalQtyType.IntType // MODIFIER.COLUMN_NUMBER
    nodePropertyDescriptors(1053) = FormalQtyType.QtyOption
    nodePropertyDescriptors(3122) = FormalQtyType.IntType // MODIFIER.LINE_NUMBER
    nodePropertyDescriptors(3123) = FormalQtyType.QtyOption
    nodePropertyDescriptors(3482) = FormalQtyType.StringType // MODIFIER.MODIFIER_TYPE
    nodePropertyDescriptors(3483) = FormalQtyType.QtyOne
    nodePropertyDescriptors(4022) = FormalQtyType.IntType // MODIFIER.ORDER
    nodePropertyDescriptors(4023) = FormalQtyType.QtyOne
    nodePropertyDescriptors(3574) = FormalQtyType.StringType // MYNODETYPE.MYPROPERTY
    nodePropertyDescriptors(3575) = FormalQtyType.QtyOne
    nodePropertyDescriptors(966) = FormalQtyType.StringType // NAMESPACE.CODE
    nodePropertyDescriptors(967) = FormalQtyType.QtyOne
    nodePropertyDescriptors(1056) = FormalQtyType.IntType // NAMESPACE.COLUMN_NUMBER
    nodePropertyDescriptors(1057) = FormalQtyType.QtyOption
    nodePropertyDescriptors(3126) = FormalQtyType.IntType // NAMESPACE.LINE_NUMBER
    nodePropertyDescriptors(3127) = FormalQtyType.QtyOption
    nodePropertyDescriptors(3666) = FormalQtyType.StringType // NAMESPACE.NAME
    nodePropertyDescriptors(3667) = FormalQtyType.QtyOne
    nodePropertyDescriptors(4026) = FormalQtyType.IntType // NAMESPACE.ORDER
    nodePropertyDescriptors(4027) = FormalQtyType.QtyOne
    nodePropertyDescriptors(968) = FormalQtyType.StringType // NAMESPACE_BLOCK.CODE
    nodePropertyDescriptors(969) = FormalQtyType.QtyOne
    nodePropertyDescriptors(1058) = FormalQtyType.IntType // NAMESPACE_BLOCK.COLUMN_NUMBER
    nodePropertyDescriptors(1059) = FormalQtyType.QtyOption
    nodePropertyDescriptors(1958) = FormalQtyType.StringType // NAMESPACE_BLOCK.FILENAME
    nodePropertyDescriptors(1959) = FormalQtyType.QtyOne
    nodePropertyDescriptors(2048) = FormalQtyType.StringType // NAMESPACE_BLOCK.FULL_NAME
    nodePropertyDescriptors(2049) = FormalQtyType.QtyOne
    nodePropertyDescriptors(3128) = FormalQtyType.IntType // NAMESPACE_BLOCK.LINE_NUMBER
    nodePropertyDescriptors(3129) = FormalQtyType.QtyOption
    nodePropertyDescriptors(3668) = FormalQtyType.StringType // NAMESPACE_BLOCK.NAME
    nodePropertyDescriptors(3669) = FormalQtyType.QtyOne
    nodePropertyDescriptors(4028) = FormalQtyType.IntType // NAMESPACE_BLOCK.ORDER
    nodePropertyDescriptors(4029) = FormalQtyType.QtyOne
    nodePropertyDescriptors(160) = FormalQtyType.IntType // RETURN.ARGUMENT_INDEX
    nodePropertyDescriptors(161) = FormalQtyType.QtyOne
    nodePropertyDescriptors(250) = FormalQtyType.StringType // RETURN.ARGUMENT_NAME
    nodePropertyDescriptors(251) = FormalQtyType.QtyOption
    nodePropertyDescriptors(970) = FormalQtyType.StringType // RETURN.CODE
    nodePropertyDescriptors(971) = FormalQtyType.QtyOne
    nodePropertyDescriptors(1060) = FormalQtyType.IntType // RETURN.COLUMN_NUMBER
    nodePropertyDescriptors(1061) = FormalQtyType.QtyOption
    nodePropertyDescriptors(3130) = FormalQtyType.IntType // RETURN.LINE_NUMBER
    nodePropertyDescriptors(3131) = FormalQtyType.QtyOption
    nodePropertyDescriptors(4030) = FormalQtyType.IntType // RETURN.ORDER
    nodePropertyDescriptors(4031) = FormalQtyType.QtyOne
    nodePropertyDescriptors(3672) = FormalQtyType.StringType // TAG.NAME
    nodePropertyDescriptors(3673) = FormalQtyType.QtyOne
    nodePropertyDescriptors(4932) = FormalQtyType.StringType // TAG.VALUE
    nodePropertyDescriptors(4933) = FormalQtyType.QtyOne
    nodePropertyDescriptors(5294) = FormalQtyType.RefType // TAG_NODE_PAIR.node
    nodePropertyDescriptors(5295) = FormalQtyType.QtyOne
    nodePropertyDescriptors(5384) = FormalQtyType.RefType // TAG_NODE_PAIR.tag
    nodePropertyDescriptors(5385) = FormalQtyType.QtyOne
    nodePropertyDescriptors(166) = FormalQtyType.IntType // TEMPLATE_DOM.ARGUMENT_INDEX
    nodePropertyDescriptors(167) = FormalQtyType.QtyOne
    nodePropertyDescriptors(256) = FormalQtyType.StringType // TEMPLATE_DOM.ARGUMENT_NAME
    nodePropertyDescriptors(257) = FormalQtyType.QtyOption
    nodePropertyDescriptors(976) = FormalQtyType.StringType // TEMPLATE_DOM.CODE
    nodePropertyDescriptors(977) = FormalQtyType.QtyOne
    nodePropertyDescriptors(1066) = FormalQtyType.IntType // TEMPLATE_DOM.COLUMN_NUMBER
    nodePropertyDescriptors(1067) = FormalQtyType.QtyOption
    nodePropertyDescriptors(3136) = FormalQtyType.IntType // TEMPLATE_DOM.LINE_NUMBER
    nodePropertyDescriptors(3137) = FormalQtyType.QtyOption
    nodePropertyDescriptors(3676) = FormalQtyType.StringType // TEMPLATE_DOM.NAME
    nodePropertyDescriptors(3677) = FormalQtyType.QtyOne
    nodePropertyDescriptors(4036) = FormalQtyType.IntType // TEMPLATE_DOM.ORDER
    nodePropertyDescriptors(4037) = FormalQtyType.QtyOne
    nodePropertyDescriptors(2058) = FormalQtyType.StringType // TYPE.FULL_NAME
    nodePropertyDescriptors(2059) = FormalQtyType.QtyOne
    nodePropertyDescriptors(3678) = FormalQtyType.StringType // TYPE.NAME
    nodePropertyDescriptors(3679) = FormalQtyType.QtyOne
    nodePropertyDescriptors(4758) = FormalQtyType.StringType // TYPE.TYPE_DECL_FULL_NAME
    nodePropertyDescriptors(4759) = FormalQtyType.QtyOne
    nodePropertyDescriptors(980) = FormalQtyType.StringType // TYPE_ARGUMENT.CODE
    nodePropertyDescriptors(981) = FormalQtyType.QtyOne
    nodePropertyDescriptors(1070) = FormalQtyType.IntType // TYPE_ARGUMENT.COLUMN_NUMBER
    nodePropertyDescriptors(1071) = FormalQtyType.QtyOption
    nodePropertyDescriptors(3140) = FormalQtyType.IntType // TYPE_ARGUMENT.LINE_NUMBER
    nodePropertyDescriptors(3141) = FormalQtyType.QtyOption
    nodePropertyDescriptors(4040) = FormalQtyType.IntType // TYPE_ARGUMENT.ORDER
    nodePropertyDescriptors(4041) = FormalQtyType.QtyOne
    nodePropertyDescriptors(82) = FormalQtyType.StringType // TYPE_DECL.ALIAS_TYPE_FULL_NAME
    nodePropertyDescriptors(83) = FormalQtyType.QtyOption
    nodePropertyDescriptors(352) = FormalQtyType.StringType // TYPE_DECL.AST_PARENT_FULL_NAME
    nodePropertyDescriptors(353) = FormalQtyType.QtyOne
    nodePropertyDescriptors(442) = FormalQtyType.StringType // TYPE_DECL.AST_PARENT_TYPE
    nodePropertyDescriptors(443) = FormalQtyType.QtyOne
    nodePropertyDescriptors(982) = FormalQtyType.StringType // TYPE_DECL.CODE
    nodePropertyDescriptors(983) = FormalQtyType.QtyOne
    nodePropertyDescriptors(1072) = FormalQtyType.IntType // TYPE_DECL.COLUMN_NUMBER
    nodePropertyDescriptors(1073) = FormalQtyType.QtyOption
    nodePropertyDescriptors(1972) = FormalQtyType.StringType // TYPE_DECL.FILENAME
    nodePropertyDescriptors(1973) = FormalQtyType.QtyOne
    nodePropertyDescriptors(2062) = FormalQtyType.StringType // TYPE_DECL.FULL_NAME
    nodePropertyDescriptors(2063) = FormalQtyType.QtyOne
    nodePropertyDescriptors(2512) = FormalQtyType.StringType // TYPE_DECL.INHERITS_FROM_TYPE_FULL_NAME
    nodePropertyDescriptors(2513) = FormalQtyType.QtyMulti
    nodePropertyDescriptors(2692) = FormalQtyType.BoolType // TYPE_DECL.IS_EXTERNAL
    nodePropertyDescriptors(2693) = FormalQtyType.QtyOne
    nodePropertyDescriptors(3142) = FormalQtyType.IntType // TYPE_DECL.LINE_NUMBER
    nodePropertyDescriptors(3143) = FormalQtyType.QtyOption
    nodePropertyDescriptors(3682) = FormalQtyType.StringType // TYPE_DECL.NAME
    nodePropertyDescriptors(3683) = FormalQtyType.QtyOne
    nodePropertyDescriptors(3862) = FormalQtyType.IntType // TYPE_DECL.OFFSET
    nodePropertyDescriptors(3863) = FormalQtyType.QtyOption
    nodePropertyDescriptors(3952) = FormalQtyType.IntType // TYPE_DECL.OFFSET_END
    nodePropertyDescriptors(3953) = FormalQtyType.QtyOption
    nodePropertyDescriptors(4042) = FormalQtyType.IntType // TYPE_DECL.ORDER
    nodePropertyDescriptors(4043) = FormalQtyType.QtyOne
    nodePropertyDescriptors(984) = FormalQtyType.StringType // TYPE_PARAMETER.CODE
    nodePropertyDescriptors(985) = FormalQtyType.QtyOne
    nodePropertyDescriptors(1074) = FormalQtyType.IntType // TYPE_PARAMETER.COLUMN_NUMBER
    nodePropertyDescriptors(1075) = FormalQtyType.QtyOption
    nodePropertyDescriptors(3144) = FormalQtyType.IntType // TYPE_PARAMETER.LINE_NUMBER
    nodePropertyDescriptors(3145) = FormalQtyType.QtyOption
    nodePropertyDescriptors(3684) = FormalQtyType.StringType // TYPE_PARAMETER.NAME
    nodePropertyDescriptors(3685) = FormalQtyType.QtyOne
    nodePropertyDescriptors(4044) = FormalQtyType.IntType // TYPE_PARAMETER.ORDER
    nodePropertyDescriptors(4045) = FormalQtyType.QtyOne
    nodePropertyDescriptors(176) = FormalQtyType.IntType // TYPE_REF.ARGUMENT_INDEX
    nodePropertyDescriptors(177) = FormalQtyType.QtyOne
    nodePropertyDescriptors(266) = FormalQtyType.StringType // TYPE_REF.ARGUMENT_NAME
    nodePropertyDescriptors(267) = FormalQtyType.QtyOption
    nodePropertyDescriptors(986) = FormalQtyType.StringType // TYPE_REF.CODE
    nodePropertyDescriptors(987) = FormalQtyType.QtyOne
    nodePropertyDescriptors(1076) = FormalQtyType.IntType // TYPE_REF.COLUMN_NUMBER
    nodePropertyDescriptors(1077) = FormalQtyType.QtyOption
    nodePropertyDescriptors(1706) = FormalQtyType.StringType // TYPE_REF.DYNAMIC_TYPE_HINT_FULL_NAME
    nodePropertyDescriptors(1707) = FormalQtyType.QtyMulti
    nodePropertyDescriptors(3146) = FormalQtyType.IntType // TYPE_REF.LINE_NUMBER
    nodePropertyDescriptors(3147) = FormalQtyType.QtyOption
    nodePropertyDescriptors(4046) = FormalQtyType.IntType // TYPE_REF.ORDER
    nodePropertyDescriptors(4047) = FormalQtyType.QtyOne
    nodePropertyDescriptors(4406) = FormalQtyType.StringType // TYPE_REF.POSSIBLE_TYPES
    nodePropertyDescriptors(4407) = FormalQtyType.QtyMulti
    nodePropertyDescriptors(4856) = FormalQtyType.StringType // TYPE_REF.TYPE_FULL_NAME
    nodePropertyDescriptors(4857) = FormalQtyType.QtyOne
    nodePropertyDescriptors(178) = FormalQtyType.IntType // UNKNOWN.ARGUMENT_INDEX
    nodePropertyDescriptors(179) = FormalQtyType.QtyOne
    nodePropertyDescriptors(268) = FormalQtyType.StringType // UNKNOWN.ARGUMENT_NAME
    nodePropertyDescriptors(269) = FormalQtyType.QtyOption
    nodePropertyDescriptors(988) = FormalQtyType.StringType // UNKNOWN.CODE
    nodePropertyDescriptors(989) = FormalQtyType.QtyOne
    nodePropertyDescriptors(1078) = FormalQtyType.IntType // UNKNOWN.COLUMN_NUMBER
    nodePropertyDescriptors(1079) = FormalQtyType.QtyOption
    nodePropertyDescriptors(1258) = FormalQtyType.StringType // UNKNOWN.CONTAINED_REF
    nodePropertyDescriptors(1259) = FormalQtyType.QtyOne
    nodePropertyDescriptors(1708) = FormalQtyType.StringType // UNKNOWN.DYNAMIC_TYPE_HINT_FULL_NAME
    nodePropertyDescriptors(1709) = FormalQtyType.QtyMulti
    nodePropertyDescriptors(3148) = FormalQtyType.IntType // UNKNOWN.LINE_NUMBER
    nodePropertyDescriptors(3149) = FormalQtyType.QtyOption
    nodePropertyDescriptors(4048) = FormalQtyType.IntType // UNKNOWN.ORDER
    nodePropertyDescriptors(4049) = FormalQtyType.QtyOne
    nodePropertyDescriptors(4318) = FormalQtyType.StringType // UNKNOWN.PARSER_TYPE_NAME
    nodePropertyDescriptors(4319) = FormalQtyType.QtyOne
    nodePropertyDescriptors(4408) = FormalQtyType.StringType // UNKNOWN.POSSIBLE_TYPES
    nodePropertyDescriptors(4409) = FormalQtyType.QtyMulti
    nodePropertyDescriptors(4858) = FormalQtyType.StringType // UNKNOWN.TYPE_FULL_NAME
    nodePropertyDescriptors(4859) = FormalQtyType.QtyOne
    nodePropertyDescriptors
  }
  override def getNumberOfNodeKinds: Int              = 45
  override def getNumberOfEdgeKinds: Int              = 24
  override def getNodeLabel(nodeKind: Int): String    = nodeLabels(nodeKind)
  override def getNodeKindByLabel(label: String): Int = nodeKindByLabel.getOrElse(label, flatgraph.Schema.UndefinedKind)
  override def getEdgeLabel(nodeKind: Int, edgeKind: Int): String = edgeLabels(edgeKind)
  override def getEdgeKindByLabel(label: String): Int = edgeKindByLabel.getOrElse(label, flatgraph.Schema.UndefinedKind)
  override def getNodePropertyNames(nodeLabel: String): Set[String] = {
    nodeLabel match {
      case "ANNOTATION" =>
        Set("ARGUMENT_INDEX", "ARGUMENT_NAME", "CODE", "COLUMN_NUMBER", "FULL_NAME", "LINE_NUMBER", "NAME", "ORDER")
      case "ANNOTATION_LITERAL" =>
        Set("ARGUMENT_INDEX", "ARGUMENT_NAME", "CODE", "COLUMN_NUMBER", "LINE_NUMBER", "NAME", "ORDER")
      case "ANNOTATION_PARAMETER"        => Set("CODE", "COLUMN_NUMBER", "LINE_NUMBER", "ORDER")
      case "ANNOTATION_PARAMETER_ASSIGN" => Set("CODE", "COLUMN_NUMBER", "LINE_NUMBER", "ORDER")
      case "ARRAY_INITIALIZER" =>
        Set("ARGUMENT_INDEX", "ARGUMENT_NAME", "CODE", "COLUMN_NUMBER", "LINE_NUMBER", "ORDER")
      case "BINDING" => Set("METHOD_FULL_NAME", "NAME", "SIGNATURE")
      case "BLOCK" =>
        Set(
          "ARGUMENT_INDEX",
          "ARGUMENT_NAME",
          "CODE",
          "COLUMN_NUMBER",
          "DYNAMIC_TYPE_HINT_FULL_NAME",
          "LINE_NUMBER",
          "ORDER",
          "POSSIBLE_TYPES",
          "TYPE_FULL_NAME"
        )
      case "CALL" =>
        Set(
          "ARGUMENT_INDEX",
          "ARGUMENT_NAME",
          "CODE",
          "COLUMN_NUMBER",
          "DISPATCH_TYPE",
          "DYNAMIC_TYPE_HINT_FULL_NAME",
          "LINE_NUMBER",
          "METHOD_FULL_NAME",
          "NAME",
          "ORDER",
          "POSSIBLE_TYPES",
          "SIGNATURE",
          "TYPE_FULL_NAME"
        )
      case "CLOSURE_BINDING" => Set("CLOSURE_BINDING_ID", "CLOSURE_ORIGINAL_NAME", "EVALUATION_STRATEGY")
      case "COMMENT"         => Set("CODE", "COLUMN_NUMBER", "FILENAME", "LINE_NUMBER", "ORDER")
      case "CONFIG_FILE"     => Set("CONTENT", "NAME")
      case "CONTROL_STRUCTURE" =>
        Set(
          "ARGUMENT_INDEX",
          "ARGUMENT_NAME",
          "CODE",
          "COLUMN_NUMBER",
          "CONTROL_STRUCTURE_TYPE",
          "LINE_NUMBER",
          "ORDER",
          "PARSER_TYPE_NAME"
        )
      case "DEPENDENCY" => Set("DEPENDENCY_GROUP_ID", "NAME", "VERSION")
      case "FIELD_IDENTIFIER" =>
        Set("ARGUMENT_INDEX", "ARGUMENT_NAME", "CANONICAL_NAME", "CODE", "COLUMN_NUMBER", "LINE_NUMBER", "ORDER")
      case "FILE"    => Set("CODE", "COLUMN_NUMBER", "CONTENT", "HASH", "LINE_NUMBER", "NAME", "ORDER")
      case "FINDING" => Set()
      case "IDENTIFIER" =>
        Set(
          "ARGUMENT_INDEX",
          "ARGUMENT_NAME",
          "CODE",
          "COLUMN_NUMBER",
          "DYNAMIC_TYPE_HINT_FULL_NAME",
          "LINE_NUMBER",
          "NAME",
          "ORDER",
          "POSSIBLE_TYPES",
          "TYPE_FULL_NAME"
        )
      case "IMPORT" =>
        Set(
          "CODE",
          "COLUMN_NUMBER",
          "EXPLICIT_AS",
          "IMPORTED_AS",
          "IMPORTED_ENTITY",
          "IS_EXPLICIT",
          "IS_WILDCARD",
          "LINE_NUMBER",
          "ORDER"
        )
      case "JUMP_LABEL" => Set("CODE", "COLUMN_NUMBER", "LINE_NUMBER", "NAME", "ORDER", "PARSER_TYPE_NAME")
      case "JUMP_TARGET" =>
        Set("ARGUMENT_INDEX", "CODE", "COLUMN_NUMBER", "LINE_NUMBER", "NAME", "ORDER", "PARSER_TYPE_NAME")
      case "KEY_VALUE_PAIR" => Set("KEY", "VALUE")
      case "LITERAL" =>
        Set(
          "ARGUMENT_INDEX",
          "ARGUMENT_NAME",
          "CODE",
          "COLUMN_NUMBER",
          "DYNAMIC_TYPE_HINT_FULL_NAME",
          "LINE_NUMBER",
          "ORDER",
          "POSSIBLE_TYPES",
          "TYPE_FULL_NAME"
        )
      case "LOCAL" =>
        Set(
          "CLOSURE_BINDING_ID",
          "CODE",
          "COLUMN_NUMBER",
          "DYNAMIC_TYPE_HINT_FULL_NAME",
          "LINE_NUMBER",
          "NAME",
          "ORDER",
          "POSSIBLE_TYPES",
          "TYPE_FULL_NAME"
        )
      case "LOCATION" =>
        Set(
          "CLASS_NAME",
          "CLASS_SHORT_NAME",
          "FILENAME",
          "LINE_NUMBER",
          "METHOD_FULL_NAME",
          "METHOD_SHORT_NAME",
          "NODE_LABEL",
          "PACKAGE_NAME",
          "SYMBOL"
        )
      case "MEMBER" =>
        Set(
          "AST_PARENT_FULL_NAME",
          "AST_PARENT_TYPE",
          "CODE",
          "COLUMN_NUMBER",
          "DYNAMIC_TYPE_HINT_FULL_NAME",
          "LINE_NUMBER",
          "NAME",
          "ORDER",
          "POSSIBLE_TYPES",
          "TYPE_FULL_NAME"
        )
      case "META_DATA" => Set("HASH", "LANGUAGE", "OVERLAYS", "ROOT", "VERSION")
      case "METHOD" =>
        Set(
          "AST_PARENT_FULL_NAME",
          "AST_PARENT_TYPE",
          "CODE",
          "COLUMN_NUMBER",
          "COLUMN_NUMBER_END",
          "FILENAME",
          "FULL_NAME",
          "HASH",
          "IS_EXTERNAL",
          "LINE_NUMBER",
          "LINE_NUMBER_END",
          "NAME",
          "OFFSET",
          "OFFSET_END",
          "ORDER",
          "SIGNATURE"
        )
      case "METHOD_PARAMETER_IN" =>
        Set(
          "CLOSURE_BINDING_ID",
          "CODE",
          "COLUMN_NUMBER",
          "DYNAMIC_TYPE_HINT_FULL_NAME",
          "EVALUATION_STRATEGY",
          "INDEX",
          "IS_VARIADIC",
          "LINE_NUMBER",
          "NAME",
          "ORDER",
          "POSSIBLE_TYPES",
          "TYPE_FULL_NAME"
        )
      case "METHOD_PARAMETER_OUT" =>
        Set(
          "CODE",
          "COLUMN_NUMBER",
          "EVALUATION_STRATEGY",
          "INDEX",
          "IS_VARIADIC",
          "LINE_NUMBER",
          "NAME",
          "ORDER",
          "TYPE_FULL_NAME"
        )
      case "METHOD_REF" =>
        Set(
          "ARGUMENT_INDEX",
          "ARGUMENT_NAME",
          "CODE",
          "COLUMN_NUMBER",
          "DYNAMIC_TYPE_HINT_FULL_NAME",
          "LINE_NUMBER",
          "METHOD_FULL_NAME",
          "ORDER",
          "POSSIBLE_TYPES",
          "TYPE_FULL_NAME"
        )
      case "METHOD_RETURN" =>
        Set(
          "CODE",
          "COLUMN_NUMBER",
          "DYNAMIC_TYPE_HINT_FULL_NAME",
          "EVALUATION_STRATEGY",
          "LINE_NUMBER",
          "ORDER",
          "POSSIBLE_TYPES",
          "TYPE_FULL_NAME"
        )
      case "MODIFIER"        => Set("CODE", "COLUMN_NUMBER", "LINE_NUMBER", "MODIFIER_TYPE", "ORDER")
      case "MYNODETYPE"      => Set("MYPROPERTY")
      case "NAMESPACE"       => Set("CODE", "COLUMN_NUMBER", "LINE_NUMBER", "NAME", "ORDER")
      case "NAMESPACE_BLOCK" => Set("CODE", "COLUMN_NUMBER", "FILENAME", "FULL_NAME", "LINE_NUMBER", "NAME", "ORDER")
      case "RETURN"          => Set("ARGUMENT_INDEX", "ARGUMENT_NAME", "CODE", "COLUMN_NUMBER", "LINE_NUMBER", "ORDER")
      case "TAG"             => Set("NAME", "VALUE")
      case "TAG_NODE_PAIR"   => Set()
      case "TEMPLATE_DOM" =>
        Set("ARGUMENT_INDEX", "ARGUMENT_NAME", "CODE", "COLUMN_NUMBER", "LINE_NUMBER", "NAME", "ORDER")
      case "TYPE"          => Set("FULL_NAME", "NAME", "TYPE_DECL_FULL_NAME")
      case "TYPE_ARGUMENT" => Set("CODE", "COLUMN_NUMBER", "LINE_NUMBER", "ORDER")
      case "TYPE_DECL" =>
        Set(
          "ALIAS_TYPE_FULL_NAME",
          "AST_PARENT_FULL_NAME",
          "AST_PARENT_TYPE",
          "CODE",
          "COLUMN_NUMBER",
          "FILENAME",
          "FULL_NAME",
          "INHERITS_FROM_TYPE_FULL_NAME",
          "IS_EXTERNAL",
          "LINE_NUMBER",
          "NAME",
          "OFFSET",
          "OFFSET_END",
          "ORDER"
        )
      case "TYPE_PARAMETER" => Set("CODE", "COLUMN_NUMBER", "LINE_NUMBER", "NAME", "ORDER")
      case "TYPE_REF" =>
        Set(
          "ARGUMENT_INDEX",
          "ARGUMENT_NAME",
          "CODE",
          "COLUMN_NUMBER",
          "DYNAMIC_TYPE_HINT_FULL_NAME",
          "LINE_NUMBER",
          "ORDER",
          "POSSIBLE_TYPES",
          "TYPE_FULL_NAME"
        )
      case "UNKNOWN" =>
        Set(
          "ARGUMENT_INDEX",
          "ARGUMENT_NAME",
          "CODE",
          "COLUMN_NUMBER",
          "CONTAINED_REF",
          "DYNAMIC_TYPE_HINT_FULL_NAME",
          "LINE_NUMBER",
          "ORDER",
          "PARSER_TYPE_NAME",
          "POSSIBLE_TYPES",
          "TYPE_FULL_NAME"
        )
      case _ => Set.empty
    }
  }
  override def getEdgePropertyName(label: String): Option[String] = {
    label match {
      case "REACHING_DEF" => Some("VARIABLE")
      case _              => None
    }
  }

  override def getPropertyLabel(nodeKind: Int, propertyKind: Int): String = {
    if (propertyKind < 56) normalNodePropertyNames(propertyKind)
    else if (propertyKind == 56 && nodeKind == 15) "evidence"      /*on node FINDING*/
    else if (propertyKind == 57 && nodeKind == 15) "keyValuePairs" /*on node FINDING*/
    else if (propertyKind == 58 && nodeKind == 23) "node"          /*on node LOCATION*/
    else if (propertyKind == 58 && nodeKind == 37) "node"          /*on node TAG_NODE_PAIR*/
    else if (propertyKind == 59 && nodeKind == 37) "tag"           /*on node TAG_NODE_PAIR*/
    else null
  }

  override def getPropertyKindByName(label: String): Int =
    nodePropertyByLabel.getOrElse(label, flatgraph.Schema.UndefinedKind)
  override def getNumberOfPropertyKinds: Int = 60
  override def makeNode(graph: flatgraph.Graph, nodeKind: Short, seq: Int): nodes.StoredNode =
    nodeFactories(nodeKind)(graph, seq)
  override def makeEdge(
    src: flatgraph.GNode,
    dst: flatgraph.GNode,
    edgeKind: Short,
    subSeq: Int,
    property: Any
  ): flatgraph.Edge = edgeFactories(edgeKind)(src, dst, subSeq, property)
  override def allocateEdgeProperty(
    nodeKind: Int,
    direction: flatgraph.Edge.Direction,
    edgeKind: Int,
    size: Int
  ): Array[?] = edgePropertyAllocators(edgeKind)(size)
  override def getNodePropertyFormalType(nodeKind: Int, propertyKind: Int): FormalQtyType.FormalType =
    nodePropertyDescriptors(propertyOffsetArrayIndex(nodeKind, propertyKind)).asInstanceOf[FormalQtyType.FormalType]
  override def getNodePropertyFormalQuantity(nodeKind: Int, propertyKind: Int): FormalQtyType.FormalQuantity =
    nodePropertyDescriptors(1 + propertyOffsetArrayIndex(nodeKind, propertyKind))
      .asInstanceOf[FormalQtyType.FormalQuantity]
}
