(ns builder.views.main
  (:require [om-tools.core :refer-macros [defcomponent]]
            [sablono.core :refer-macros [html]]))

(defcomponent view [data owner]
  (render [_] (html [:div "This is working"])))
