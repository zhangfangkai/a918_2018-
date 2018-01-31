# -*- coding: utf-8 -*-
from __future__ import unicode_literals
from django.db import models

# Create your models here.
class Question(models.Model):
    question_name = models.CharField(max_length=50)
    question_content = models.CharField(max_length=500)
    date = models.DateTimeField('date published')

class User(models.Model):
    username = models.CharField(max_length=50)
    password = models.CharField(max_length=50)

class Answer(models.Model):
    user = models.ForeignKey(User, on_delete=models.CASCADE)
    question = models.ForeignKey(Question, on_delete=models.CASCADE)
    answer_text = models.CharField(max_length=200)
    date = models.DateTimeField('date answered')
