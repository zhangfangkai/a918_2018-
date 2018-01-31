# -*- coding: utf-8 -*-
from django.urls import path

from .views import *

urlpatterns = [
    # 默认
    path('', index, name='index'),

    path('index/', index, name='index'),
    #下面是url映射通用写法
    # path('index/', index, name='index'),

]