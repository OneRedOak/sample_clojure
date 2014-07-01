(ns sample.core-test 
  (:require [clojure.test :refer :all]
            [sample.core :refer :all]))
(use 'clojure.test)
(use 'clojure.test.junit)

(with-junit-output
	(run-tests 'sample.core-test))

(deftest a-test
  (testing "Simple addition"
    (is (= 15 (-main 5)))))