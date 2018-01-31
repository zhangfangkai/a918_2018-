# -*- coding: utf-8 -*-
from django.shortcuts import render,render_to_response
from django.template import RequestContext
from django.http import HttpResponse
# Create your views here.

def index(req):
    data={}
    return render_to_response('index.html',data,RequestContext(req))
    # return HttpResponse("Hello, world. You're at the polls index.")

# !- 下面是一般通用的写法
# def login_view(req):
#     if req.method == 'POST':
#         username = req.POST.get('username', '')  # 返回的username是unicode
#         password = req.POST.get('password', '')
#         user = authenticate(username=username, password=password)
#         if user is not None:
#             login(req, user)
#             Log(action_flag=True, user=user, time=timezone.now(), action='login', message='登陆成功').save()
#             messages.add_message(req, messages.INFO, '登陆成功！')
#             return HttpResponseRedirect('/jl_back/frame')
#         else:
#             Log(action_flag=False, user=None, time=timezone.now(), action='login', message='登陆失败,登陆名{}'.format(username)).save()
#             messages.add_message(req, messages.INFO, '密码或用户名错误！')
#     return render_to_response('login.html', {}, RequestContext(req))

# def check_report(req):
#     res = dict()
#     re = []
#     for i in Report.objects.all():
#         r = dict()
#         r["id"] = i.id
#         r["name"] = i.name
#         r["date"] = i.date
#         re.append(r)
#     res["report"] = re
#     return render_to_response("check_report.html", res, RequestContext(req))