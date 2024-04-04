def longest_word(text):
    words = text.split()
    max_length = len(max(words, key=len))
    longest_words = [word for word in words if len(word) == max_length]
    return longest_words[0], max_length

text = input()
print(*longest_word(text))
