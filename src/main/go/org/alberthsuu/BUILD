load("@io_bazel_rules_go//go:def.bzl", "go_binary", "go_test")

go_binary(
    name = "hello",
    srcs = ["hello.go"],
    deps = ["//src/main/go/org/alberthsuu/custommath"],
)

go_test(
    name = "hello_test",
    srcs = [
        "hello_test.go",
    ],
    # embed = [":foo_lib"],
    # deps = [
    #     "//testtools",
    #     "@org_golang_x_utils//morestuff",
    # ],
)
