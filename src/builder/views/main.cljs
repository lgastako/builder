(ns builder.views.main
  (:require [devcards.core :refer-macros [defcard deftest]]
            [om-tools.core :refer-macros [defcomponent]]
            [sablono.core :refer-macros [html]]))

(defcard first-card
  (html [:div [:h1 "This is your first devcard!"]]))

(defcomponent view [data owner]
  (render [_] (html [:div "This is working"])))
