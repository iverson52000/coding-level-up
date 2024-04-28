cc_library(
    name = "cat",
    srcs = ["cat.cc"],
    hdrs = ["cat.h"],
)

cc_binary(
    name = "hello",
    srcs = ["hello.cc"],
    deps = [
        ":cat",
        "@com_google_absl//absl/strings",
    ],
)

cc_test(
    name = "hello_test",
    size = "small",
    srcs = ["hello_test.cc"],
    deps = ["@com_google_googletest//:gtest_main"],
)
