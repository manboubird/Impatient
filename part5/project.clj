(defproject impatient "0.1.0-SNAPSHOT"
  :description "Cascalog for the Impatient - Part 5"
  :url "https://github.com/Quantisan/Impatient/tree/cascalog/part5"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :uberjar-name "impatient.jar"
  :aot [impatient.core]
  :main impatient.core
  :dependencies [[org.clojure/clojure "1.5.1"]
                 [cascalog "1.10.1"]
                 [cascalog/cascalog-more-taps "1.10.1"]]
  :profiles {:provided {:dependencies [[org.apache.hadoop/hadoop-core "0.20.2-cdh3u2"]]}}
  :repositories [["conjars.org" "http://conjars.org/repo"]
                 ["cloudera" "https://repository.cloudera.com/content/groups/public/"]]
  ) 
