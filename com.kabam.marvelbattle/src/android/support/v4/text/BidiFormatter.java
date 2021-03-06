package android.support.v4.text;

import java.util.Locale;

public final class BidiFormatter
{
  private static final int DEFAULT_FLAGS = 2;
  private static final BidiFormatter DEFAULT_LTR_INSTANCE = new BidiFormatter(false, 2, DEFAULT_TEXT_DIRECTION_HEURISTIC);
  private static final BidiFormatter DEFAULT_RTL_INSTANCE = new BidiFormatter(true, 2, DEFAULT_TEXT_DIRECTION_HEURISTIC);
  private static TextDirectionHeuristicCompat DEFAULT_TEXT_DIRECTION_HEURISTIC = TextDirectionHeuristicsCompat.FIRSTSTRONG_LTR;
  private static final int DIR_LTR = -1;
  private static final int DIR_RTL = 1;
  private static final int DIR_UNKNOWN = 0;
  private static final String EMPTY_STRING = "";
  private static final int FLAG_STEREO_RESET = 2;
  private static final char LRE = '‪';
  private static final char LRM = '‎';
  private static final String LRM_STRING = Character.toString('‎');
  private static final char PDF = '‬';
  private static final char RLE = '‫';
  private static final char RLM = '‏';
  private static final String RLM_STRING = Character.toString('‏');
  private final TextDirectionHeuristicCompat mDefaultTextDirectionHeuristicCompat;
  private final int mFlags;
  private final boolean mIsRtlContext;
  
  private BidiFormatter(boolean paramBoolean, int paramInt, TextDirectionHeuristicCompat paramTextDirectionHeuristicCompat)
  {
    this.mIsRtlContext = paramBoolean;
    this.mFlags = paramInt;
    this.mDefaultTextDirectionHeuristicCompat = paramTextDirectionHeuristicCompat;
  }
  
  private static int getEntryDir(String paramString)
  {
    return new DirectionalityEstimator(paramString, false).getEntryDir();
  }
  
  private static int getExitDir(String paramString)
  {
    return new DirectionalityEstimator(paramString, false).getExitDir();
  }
  
  public static BidiFormatter getInstance()
  {
    return new Builder().build();
  }
  
  public static BidiFormatter getInstance(Locale paramLocale)
  {
    return new Builder(paramLocale).build();
  }
  
  public static BidiFormatter getInstance(boolean paramBoolean)
  {
    return new Builder(paramBoolean).build();
  }
  
  private static boolean isRtlLocale(Locale paramLocale)
  {
    boolean bool = true;
    if (TextUtilsCompat.getLayoutDirectionFromLocale(paramLocale) == 1) {}
    for (;;)
    {
      return bool;
      bool = false;
    }
  }
  
  private String markAfter(String paramString, TextDirectionHeuristicCompat paramTextDirectionHeuristicCompat)
  {
    boolean bool = paramTextDirectionHeuristicCompat.isRtl(paramString, 0, paramString.length());
    if ((!this.mIsRtlContext) && ((bool) || (getExitDir(paramString) == 1))) {
      paramString = LRM_STRING;
    }
    for (;;)
    {
      return paramString;
      if ((this.mIsRtlContext) && ((!bool) || (getExitDir(paramString) == -1))) {
        paramString = RLM_STRING;
      } else {
        paramString = "";
      }
    }
  }
  
  private String markBefore(String paramString, TextDirectionHeuristicCompat paramTextDirectionHeuristicCompat)
  {
    boolean bool = paramTextDirectionHeuristicCompat.isRtl(paramString, 0, paramString.length());
    if ((!this.mIsRtlContext) && ((bool) || (getEntryDir(paramString) == 1))) {
      paramString = LRM_STRING;
    }
    for (;;)
    {
      return paramString;
      if ((this.mIsRtlContext) && ((!bool) || (getEntryDir(paramString) == -1))) {
        paramString = RLM_STRING;
      } else {
        paramString = "";
      }
    }
  }
  
  public boolean getStereoReset()
  {
    if ((this.mFlags & 0x2) != 0) {}
    for (boolean bool = true;; bool = false) {
      return bool;
    }
  }
  
  public boolean isRtl(String paramString)
  {
    return this.mDefaultTextDirectionHeuristicCompat.isRtl(paramString, 0, paramString.length());
  }
  
  public boolean isRtlContext()
  {
    return this.mIsRtlContext;
  }
  
  public String unicodeWrap(String paramString)
  {
    return unicodeWrap(paramString, this.mDefaultTextDirectionHeuristicCompat, true);
  }
  
  public String unicodeWrap(String paramString, TextDirectionHeuristicCompat paramTextDirectionHeuristicCompat)
  {
    return unicodeWrap(paramString, paramTextDirectionHeuristicCompat, true);
  }
  
  public String unicodeWrap(String paramString, TextDirectionHeuristicCompat paramTextDirectionHeuristicCompat, boolean paramBoolean)
  {
    if (paramString == null)
    {
      paramString = null;
      return paramString;
    }
    boolean bool = paramTextDirectionHeuristicCompat.isRtl(paramString, 0, paramString.length());
    StringBuilder localStringBuilder = new StringBuilder();
    label51:
    char c;
    if ((getStereoReset()) && (paramBoolean))
    {
      if (bool)
      {
        paramTextDirectionHeuristicCompat = TextDirectionHeuristicsCompat.RTL;
        localStringBuilder.append(markBefore(paramString, paramTextDirectionHeuristicCompat));
      }
    }
    else
    {
      if (bool == this.mIsRtlContext) {
        break label155;
      }
      if (!bool) {
        break label147;
      }
      c = '‫';
      label82:
      localStringBuilder.append(c);
      localStringBuilder.append(paramString);
      localStringBuilder.append('‬');
      label106:
      if (paramBoolean) {
        if (!bool) {
          break label165;
        }
      }
    }
    label147:
    label155:
    label165:
    for (paramTextDirectionHeuristicCompat = TextDirectionHeuristicsCompat.RTL;; paramTextDirectionHeuristicCompat = TextDirectionHeuristicsCompat.LTR)
    {
      localStringBuilder.append(markAfter(paramString, paramTextDirectionHeuristicCompat));
      paramString = localStringBuilder.toString();
      break;
      paramTextDirectionHeuristicCompat = TextDirectionHeuristicsCompat.LTR;
      break label51;
      c = '‪';
      break label82;
      localStringBuilder.append(paramString);
      break label106;
    }
  }
  
  public String unicodeWrap(String paramString, boolean paramBoolean)
  {
    return unicodeWrap(paramString, this.mDefaultTextDirectionHeuristicCompat, paramBoolean);
  }
  
  public static final class Builder
  {
    private int mFlags;
    private boolean mIsRtlContext;
    private TextDirectionHeuristicCompat mTextDirectionHeuristicCompat;
    
    public Builder()
    {
      initialize(BidiFormatter.isRtlLocale(Locale.getDefault()));
    }
    
    public Builder(Locale paramLocale)
    {
      initialize(BidiFormatter.isRtlLocale(paramLocale));
    }
    
    public Builder(boolean paramBoolean)
    {
      initialize(paramBoolean);
    }
    
    private static BidiFormatter getDefaultInstanceFromContext(boolean paramBoolean)
    {
      if (paramBoolean) {}
      for (BidiFormatter localBidiFormatter = BidiFormatter.DEFAULT_RTL_INSTANCE;; localBidiFormatter = BidiFormatter.DEFAULT_LTR_INSTANCE) {
        return localBidiFormatter;
      }
    }
    
    private void initialize(boolean paramBoolean)
    {
      this.mIsRtlContext = paramBoolean;
      this.mTextDirectionHeuristicCompat = BidiFormatter.DEFAULT_TEXT_DIRECTION_HEURISTIC;
      this.mFlags = 2;
    }
    
    public BidiFormatter build()
    {
      if ((this.mFlags == 2) && (this.mTextDirectionHeuristicCompat == BidiFormatter.DEFAULT_TEXT_DIRECTION_HEURISTIC)) {}
      for (BidiFormatter localBidiFormatter = getDefaultInstanceFromContext(this.mIsRtlContext);; localBidiFormatter = new BidiFormatter(this.mIsRtlContext, this.mFlags, this.mTextDirectionHeuristicCompat, null)) {
        return localBidiFormatter;
      }
    }
    
    public Builder setTextDirectionHeuristic(TextDirectionHeuristicCompat paramTextDirectionHeuristicCompat)
    {
      this.mTextDirectionHeuristicCompat = paramTextDirectionHeuristicCompat;
      return this;
    }
    
    public Builder stereoReset(boolean paramBoolean)
    {
      if (paramBoolean) {}
      for (this.mFlags |= 0x2;; this.mFlags &= 0xFFFFFFFD) {
        return this;
      }
    }
  }
  
  private static class DirectionalityEstimator
  {
    private static final byte[] DIR_TYPE_CACHE = new byte['܀'];
    private static final int DIR_TYPE_CACHE_SIZE = 1792;
    private int charIndex;
    private final boolean isHtml;
    private char lastChar;
    private final int length;
    private final String text;
    
    static
    {
      for (int i = 0; i < 1792; i++) {
        DIR_TYPE_CACHE[i] = Character.getDirectionality(i);
      }
    }
    
    DirectionalityEstimator(String paramString, boolean paramBoolean)
    {
      this.text = paramString;
      this.isHtml = paramBoolean;
      this.length = paramString.length();
    }
    
    private static byte getCachedDirectionality(char paramChar)
    {
      if (paramChar < '܀') {}
      for (byte b = DIR_TYPE_CACHE[paramChar];; b = Character.getDirectionality(paramChar)) {
        return b;
      }
    }
    
    private byte skipEntityBackward()
    {
      int j = this.charIndex;
      if (this.charIndex > 0)
      {
        String str = this.text;
        int i = this.charIndex - 1;
        this.charIndex = i;
        this.lastChar = str.charAt(i);
        if (this.lastChar != '&') {}
      }
      for (byte b = 12;; b = 13)
      {
        return b;
        if (this.lastChar != ';') {
          break;
        }
        this.charIndex = j;
        this.lastChar = ';';
      }
    }
    
    private byte skipEntityForward()
    {
      char c;
      do
      {
        if (this.charIndex >= this.length) {
          break;
        }
        String str = this.text;
        int i = this.charIndex;
        this.charIndex = (i + 1);
        c = str.charAt(i);
        this.lastChar = c;
      } while (c != ';');
      return 12;
    }
    
    private byte skipTagBackward()
    {
      int j = this.charIndex;
      label154:
      for (;;)
      {
        String str;
        int k;
        if (this.charIndex > 0)
        {
          str = this.text;
          k = this.charIndex - 1;
          this.charIndex = k;
          this.lastChar = str.charAt(k);
          if (this.lastChar != '<') {}
        }
        for (byte b = 12;; b = 13)
        {
          return b;
          if (this.lastChar != '>') {
            break;
          }
          this.charIndex = j;
          this.lastChar = '>';
        }
        if ((this.lastChar == '"') || (this.lastChar == '\''))
        {
          k = this.lastChar;
          for (;;)
          {
            if (this.charIndex <= 0) {
              break label154;
            }
            str = this.text;
            int m = this.charIndex - 1;
            this.charIndex = m;
            int i = str.charAt(m);
            this.lastChar = i;
            if (i == k) {
              break;
            }
          }
        }
      }
    }
    
    private byte skipTagForward()
    {
      int i = this.charIndex;
      String str;
      int j;
      if (this.charIndex < this.length)
      {
        str = this.text;
        j = this.charIndex;
        this.charIndex = (j + 1);
        this.lastChar = str.charAt(j);
        if (this.lastChar != '>') {}
      }
      for (byte b = 12;; b = 13)
      {
        return b;
        if ((this.lastChar != '"') && (this.lastChar != '\'')) {
          break;
        }
        int k = this.lastChar;
        for (;;)
        {
          if (this.charIndex >= this.length) {
            break label136;
          }
          str = this.text;
          j = this.charIndex;
          this.charIndex = (j + 1);
          char c = str.charAt(j);
          this.lastChar = c;
          if (c == k) {
            break;
          }
        }
        label136:
        break;
        this.charIndex = i;
        this.lastChar = '<';
      }
    }
    
    byte dirTypeBackward()
    {
      this.lastChar = this.text.charAt(this.charIndex - 1);
      byte b1;
      if (Character.isLowSurrogate(this.lastChar))
      {
        int i = Character.codePointBefore(this.text, this.charIndex);
        this.charIndex -= Character.charCount(i);
        b1 = Character.getDirectionality(i);
      }
      for (;;)
      {
        return b1;
        this.charIndex -= 1;
        byte b2 = getCachedDirectionality(this.lastChar);
        b1 = b2;
        if (this.isHtml) {
          if (this.lastChar == '>')
          {
            b1 = skipTagBackward();
          }
          else
          {
            b1 = b2;
            if (this.lastChar == ';') {
              b1 = skipEntityBackward();
            }
          }
        }
      }
    }
    
    byte dirTypeForward()
    {
      this.lastChar = this.text.charAt(this.charIndex);
      byte b1;
      if (Character.isHighSurrogate(this.lastChar))
      {
        int i = Character.codePointAt(this.text, this.charIndex);
        this.charIndex += Character.charCount(i);
        b1 = Character.getDirectionality(i);
      }
      for (;;)
      {
        return b1;
        this.charIndex += 1;
        byte b2 = getCachedDirectionality(this.lastChar);
        b1 = b2;
        if (this.isHtml) {
          if (this.lastChar == '<')
          {
            b1 = skipTagForward();
          }
          else
          {
            b1 = b2;
            if (this.lastChar == '&') {
              b1 = skipEntityForward();
            }
          }
        }
      }
    }
    
    int getEntryDir()
    {
      this.charIndex = 0;
      int i = 0;
      int k = 0;
      int m = 0;
      int j;
      for (;;)
      {
        if ((this.charIndex < this.length) && (m == 0)) {
          switch (dirTypeForward())
          {
          case 9: 
          case 3: 
          case 4: 
          case 5: 
          case 6: 
          case 7: 
          case 8: 
          case 10: 
          case 11: 
          case 12: 
          case 13: 
          default: 
            m = i;
            break;
          case 14: 
          case 15: 
            i++;
            k = -1;
            break;
          case 16: 
          case 17: 
            i++;
            k = 1;
            break;
          case 18: 
            i--;
            k = 0;
            break;
          case 0: 
            if (i == 0) {
              j = -1;
            }
            break;
          }
        }
      }
      for (;;)
      {
        return j;
        m = i;
        break;
        if (i == 0)
        {
          j = 1;
        }
        else
        {
          m = i;
          break;
          if (m == 0)
          {
            j = 0;
          }
          else
          {
            j = k;
            if (k == 0)
            {
              for (;;)
              {
                if (this.charIndex <= 0) {
                  break label287;
                }
                switch (dirTypeBackward())
                {
                default: 
                  break;
                case 14: 
                case 15: 
                  if (m == i)
                  {
                    j = -1;
                    break;
                  }
                  i--;
                  break;
                case 16: 
                case 17: 
                  if (m == i)
                  {
                    j = 1;
                    break;
                  }
                  i--;
                  break;
                case 18: 
                  i++;
                }
              }
              label287:
              j = 0;
            }
          }
        }
      }
    }
    
    int getExitDir()
    {
      int m = -1;
      this.charIndex = this.length;
      int i = 0;
      int j = 0;
      int k;
      for (;;)
      {
        if (this.charIndex > 0) {
          switch (dirTypeBackward())
          {
          case 9: 
          case 3: 
          case 4: 
          case 5: 
          case 6: 
          case 7: 
          case 8: 
          case 10: 
          case 11: 
          case 12: 
          case 13: 
          default: 
            if (j == 0) {
              j = i;
            }
            break;
          case 0: 
            if (i == 0) {
              k = m;
            }
            break;
          }
        }
      }
      for (;;)
      {
        return k;
        if (j != 0) {
          break;
        }
        j = i;
        break;
        k = m;
        if (j != i)
        {
          i--;
          break;
          if (i == 0)
          {
            k = 1;
          }
          else
          {
            if (j != 0) {
              break;
            }
            j = i;
            break;
            if (j == i)
            {
              k = 1;
            }
            else
            {
              i--;
              break;
              i++;
              break;
              k = 0;
            }
          }
        }
      }
    }
  }
}


/* Location:              C:\tools\androidhack\com.kabam.marvelbattle\classes.jar!\android\support\v4\text\BidiFormatter.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */